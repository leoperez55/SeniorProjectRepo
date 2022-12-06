import numpy as np
import re
#ticketList = np.genfromtxt("TSRPT_Sample1.txt", delimiter='', encoding="utf-8")
import sys
import tkinter as tk
from tkinter import filedialog

window = tk.Tk()
fileName = tk.StringVar()
tranCourses = tk.StringVar()
delCourses = tk.StringVar()

UIArea = tk.Frame(window)
UIArea.grid()

CyberSec = ["CS 6324", "CS 6363", "CS 6378", "CS 6332", "CS 6348", "CS 6349", "CS 6377"]
DataScience = ["CS 6313","CS 6350", "CS 6363", "CS 6375", "CS 6301", "CS 6320", "CS 6327", "CS 6347", "CS 6360"]
IntelSys = ["CS 6320", "CS 6363", "CS 6364", "CS 6375", "CS 6360", "CS 6378"]
IntComp = ["CS 6326", "CS 6363", "CS 6323", "CS 6328", "CS 6331", "CS 6334", "CS 6366"]
NetTele = ["CS 6352", "CS 6363", "CS 6378", "CS 6385", "CS 6390"]
Systems = ["CS 6304", "CS 6363", "CS 6378", "CS 6396", "CS 6349", "CS 6376", "CS 6380", "CS 6397"]
preCS = ["CS 5333", "CS 5343", "CS 5348", "CS 5390"]
preDS = ["CS 3341", "SE 3341", "STAT 3341", "CS 6360", "CS 5343", "CS 5333"]
preIS = ["CS 5343", "CS 5333", "CS 5348"]
preIC = ["CS 5343", "CS 5333", "CS 5330", "MATH 2418"]
preNT = ["CS 5333", "CS 5343", "CS 5348", "CS 3341", "ENGR 3341", "CS 5390"]
preS = ["CS 5333", "CS 5343", "CS 5348", "CS 5390", "CS 2340", "EE 4304"]

MasterPreList = sorted(list(set().union(preCS,preDS,preIS,preIC,preNT,preS)))
MasterPreListVar= tk.StringVar(value = MasterPreList)
MasterBox = tk.Listbox(UIArea, listvariable = MasterPreListVar, selectmode = tk.MULTIPLE, exportselection = 0)
MasterBox.grid(column = 1,row = 2)

trackOptions = ["Cyber Security", "Data Science", "Intelligent Systems", "Interactive Computing", "Networks and Telecommunication", "Systems"]
track = tk.StringVar(value = trackOptions)
trackBox = tk.Listbox(UIArea, listvariable = track, selectmode = tk.SINGLE, exportselection = 0)
trackBox.grid(column = 1,row = 0)


MasterCoreList = sorted(list(set().union(CyberSec,DataScience,IntelSys,IntComp,NetTele,Systems)))
MasterCoreListVar= tk.StringVar(value = MasterCoreList)
MasterCoreBox = tk.Listbox(UIArea, listvariable = MasterCoreListVar, selectmode = tk.MULTIPLE, exportselection = 0)
MasterCoreBox.grid(column = 1,row = 3)

def TRSPTMaker():

    
    transferedCourses = [MasterPreList[i] for i in MasterBox.curselection()]
    deletedCourses = [MasterCoreList[i] for i in MasterCoreBox.curselection()]
    
    trackName = trackOptions[trackBox.curselection()[0]]

    transcriptFile = fileName.get()


    file1 = open(transcriptFile, 'r')
    Lines = file1.readlines()
    

    studentName = ""
    studentID = ""

    externalDegrees = []

    programHistory = []

    semesterColumnHeader = "Course Description Attempted Earned Grade Points"
    semesterTags = semesterColumnHeader.split();


    #list of lists. 1 course = 1 list
    completedCourses = []

    #with open('TSRPT_Sample1.txt', 'r') as file:
    newSectionFlag = False


    coreCount = 0
    trackArray = []
    def trackFinder(trackName):
        #print(trackName)
        match trackName:
            case "Cyber Security":
                trackArray = Cybersec         
            case "Data Science":
                trackArray = DataScience
                return trackArray
            case "IntelSys":
                trackArray = IntelSys
            case "Interactive Computing":
                trackArray = IntComp
            case "Networks and Telecommunications":
                trackArray = NetTele
            case "Systems":
                trackArray = Systems        
            case default:
                return "something"


    coreList = []
    electivesList = []

    def initCoreList(courseArray):
        #print("trackArray: ")
        #print(trackArray)
        for course in completedCourses:
            #print(course[0])
            if(course[0] in trackArray):
                coreList.append(course)
            else:
                electivesList.append(course)


    def getGPA(array):
        gpa = 0;
        attempted = 0;

        for course in array:
            if(len(course) < 7):
                continue
            
            gpa = gpa + float(course[5])
            attempted = attempted + float(course[2])

        gpa = gpa / attempted


        return gpa


    def getCreditHours(array):
        ch=0
        for course in array:
            if isinstance(course,str):
                ch= ch+float(course[-3])
            else:
                ch=ch + float(course[0][-3])
            
        return ch



    for i in range(len(Lines)):

        line = Lines[i].rstrip()

        if(line == semesterColumnHeader):
            newSectionFlag = True
            #print(line)
            while(newSectionFlag == True):
                i = i+1
                line = Lines[i].rstrip()
                
                if((line[:2] == 'CS') or (line[:2] == "SE")):
                    course = []

                    ##print(line)

                    courseLine = line.split()

                    courseLine[0] = courseLine[0] + " " + courseLine[1]
                    courseLine.pop(1)
                    while(re.search('[a-zA-Z&]', courseLine[2])):
                            courseLine[1] = courseLine[1] + " " + courseLine[2]
                            courseLine.pop(2)

                            

                    #print(courseLine)
                    #parse out info for course
                    ##print(course)
                    # in java, make an empty list/array/etc of size 6, or just loop and append to list.
                    for x in range(len(courseLine)):
                    
                        course.append(courseLine[x])

                    i = i+1
                    line = Lines[i].rstrip()
                    if(line[0:10] == "Instructor"):
                        #get all characers after ':'

                        firstInstructor = line[11:]
                        instructors = []
                        instructors.append(firstInstructor)
                        instructorFlag = True
                        while(instructorFlag == True):
                            i = i+1
                            line = Lines[i].rstrip()

                            if(line != "Attempted Earned GPA Uts Points" and line[:2] != "CS" and line[:2] != "SE" and line != "Unofficial Transcript - UT-Dallas"):
                                instructors.append(line)
                            else:
                                i = i-1
                                instructorFlag = False

                        course.append(instructors)

                    completedCourses.append(course)

                else:

                    newSectionFlag = False


        elif(line[:6] == "Name: "):
            studentName = line[6:]
        elif(line[:12] == "Student ID: "):
            studentID = line[12:]

    trackArray = np.setdiff1d(trackFinder(trackName), deletedCourses)
    initCoreList(completedCourses)

    #print("CoreList: ")

    #for i in coreList:
    #    print(i[0])
    #    print('\n')

    #print("Electives List: ")

    #for i in electivesList:
    #    print(i[0])
    #    print('\n')

    #print("Remaining Courses: ")

    #set_diff = np.setdiff1d(trackArray, coreList)
    #print(set_diff)
        

    #print("coreList: ")
    #print(coreList)
    #print("electiveList: ")

    #print("Name: " + studentName)
    #print("ID: " + studentID)

    coreGpa = getGPA(coreList)
    electiveGpa = getGPA(electivesList)

    cumGPA = getGPA(completedCourses)

    
    remainingCourses = np.setdiff1d(trackArray,[course[0] for course in coreList] + transferedCourses)

    EE = [c[0] for c in electivesList] + [c for c in transferedCourses if c not in trackArray]
    ECH = getCreditHours(EE)
    remainingElectives = max(18- ECH, 0)
    UECH = getCreditHours(e for e in EE if e[-4]=="6")
    remainingUpperElectives= max(15 - UECH, 0)


    CCH= getCreditHours(completedCourses)

    ACH= getCreditHours(remainingCourses) + 3*(remainingElectives)

    CGP= cumGPA * CCH
    AGP=3.000*(CCH+ACH)- CGP
    reqGPA= AGP/ACH

    #print("Core GPA: {coreGPA}".format(coreGPA=coreGpa))
    #print("Elective GPA: {electiveGPA}".format(electiveGPA=electiveGpa))
    #print("Cum GPA: {cumGPA}".format(cumGPA=cumGpa))
    #for i in completedCourses:
    #    print(i)
    #    print('\n')
    #    #print("Line{}: {}".format(count, line.strip()))
    #ticketList = ticketList.astype(int)
    ##print(ticketList)
    #for i in ticketList:
    #   #print(i)




    #credit hours * classes = 





    """
    print("coreList: ")

        print(i[0])
        print('\n')

    print(electivesList)

    for i in electivesList:
        print(i[0])
        print('\n')
    """

    #print("coreList: ")
    #print(coreList)
    #print("electiveList: ")

    '''
    print("Name: " + studentName)
    print("ID: " + studentID)

    coreGpa = getGPA(coreList)
    electiveGpa = getGPA(electivesList)

    cumGpa = getGPA(completedCourses)


    print(coreGpa)
    print(electiveGpa)
    print(cumGpa) 
    '''



    gpaNeeded = 3.333

    
    classesNeededString = ', '.join(remainingCourses)

    coreListString = ", ".join(course[0] for course in coreList)
    electivesListString = ", ".join(course[0] for course in electivesList)




    #    electivesListString = ','.join(electivesList)


    from fpdf import FPDF
     
     
    # save FPDF() class into a
    # variable pdf
    pdf = FPDF()
     
    # Add a page
    pdf.add_page()
     
    # set style and size of font
    # that you want in the pdf
    pdf.set_font("Arial", size = 11)

    lines2 = [f"Name:  {studentName}                          ID: {studentID}\n", 
            "Plan: Master                                Major: Computer Science\n",
            f"Track: {trackName}\n\n",
            f"Core GPA: {coreGpa:.3f}\n",
            f"Elective GPA: {electiveGpa:.3f}\n",
            f"Combined GPA: {cumGPA:.3f}\n\n",
            f"Core Courses: {coreListString}\n",
            f"Elective Courses: {electivesListString}\n\n",
            f"Leveling Courses and Pre-requisites from Admission Letter:\n",
            f"{transferedCourses}\n\n",
            f"Outstanding Requirements:\n",
            f"The student needs a GPA >= {reqGPA:.3f} in {classesNeededString} ",
            f"and {remainingElectives} elective hours with {remainingUpperElectives} from 6XXX courses"]
     

    for idx, line in enumerate(lines2, start=0):
        pdf.write(5, line)


    #, #ln = 1, align = 'C')
     
    # add another cell
    #pdf.cell(200, 10, txt = "A Computer Science portal for geeks.",
             #ln = 2, align = 'C')
     
    # save the pdf with name .pdf
    pdf.output(f"{studentName}.pdf")  






tk.Label(UIArea,text = "Track:").grid(column = 0,row = 0)

tk.Label(UIArea,text = "File Name:").grid(column = 0,row = 1)
fileButton = tk.Button (UIArea, command=lambda: fileName.set(tk.filedialog.askopenfilename()), text= "Choose File").grid(column= 1, row= 1)

tk.Label(UIArea,text = "Leveling Courses/Prerequisites(optional):").grid(column = 0,row = 2)
tk.Label(UIArea,text = "Courses to be removed(optional):").grid(column = 0,row = 3)


tk.Button(UIArea, text = "Cancel", command = window.destroy).grid(column = 0, row = 4)
tk.Button(UIArea, text = "Submit", command = TRSPTMaker).grid(column = 1, row = 4)
tk.mainloop()
