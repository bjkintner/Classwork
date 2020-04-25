/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.exercisestudentquizscores;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author bryantkintner
 */
public class App {
    public static void main(String[] args) {
        
        ///Default students are Adam, Bill, Charlie, Dave
        //Instantiate userIO
        UserIO io = new UserIOimpl();
        Calculator calc = new Calculator();
        
        //Declare HashMap and ArrayList to be used
        HashMap<String, ArrayList> teacherKey = new HashMap<>();
        
        //Load default students
        ArrayList<Integer> tuaScores = new ArrayList<>();
        tuaScores.add(90);
        tuaScores.add(100);
        tuaScores.add(90);
        teacherKey.put("Tua", tuaScores);
        
        ArrayList<Integer> smittyScores = new ArrayList<>();
        smittyScores.add(80);
        smittyScores.add(60);
        smittyScores.add(80);
        teacherKey.put("Smitty", smittyScores);
        
        ArrayList<Integer> jerryScores = new ArrayList<>();
        jerryScores.add(100);
        jerryScores.add(100);
        jerryScores.add(100);
        teacherKey.put("Jerry", jerryScores);
        
        ArrayList<Integer> henryScores = new ArrayList<>();
        henryScores.add(20);
        henryScores.add(60);
        henryScores.add(40);
        teacherKey.put("Henry", henryScores);
        
        boolean repeat = true;
        
        while (repeat) {
        io.print("What would you like to do?");
        io.print("1. Add a new student");
        io.print("2. Remove an existing student");
        io.print("3. View all students");
        io.print("4. View student scores");
        io.print("5. View class scores");
        io.print("6. View student average");
        io.print("7. View class average");
        io.print("8. View highest scores");
        io.print("9. View lowest scores");
        io.print("10. Exit");
        
        int menuChoice = io.readInt("Please make your selection now", 1, 10);
        
        switch (menuChoice) {
                
                case 1: //Add a new student
                    String newStudentName = io.readString("Enter the student's name");
                    int score1 = io.readInt("What is their first score? (1-10)", 1, 10);
                    score1 = score1 * 10;
                    int score2 = io.readInt("What is their second score? (1-10)", 1, 10);
                    score2 = score2 * 10;
                    int score3 = io.readInt("What is their third score? (1-10)", 1, 10);
                    score3 = score3 * 10;
                    ArrayList<Integer> newScores = new ArrayList<>();
                    newScores.add(score1);
                    newScores.add(score2);
                    newScores.add(score3);
                    teacherKey.put(newStudentName, newScores);
                    io.print(newStudentName + "Has been added");
                    break;
                
                case 2: //Remove an existing student
                    String toDelete = io.readString("Which student would you like to delete?");
                    teacherKey.remove(toDelete);
                    io.print(toDelete + "Has been removed");
                    break;
                
                case 3: //View all students
                    Set<String> keys = teacherKey.keySet();
                    System.out.println("--- Students ---");
                        for (String k : keys) {
                        io.print(k);
                        }
                    break;
                    
                case 4: //View student scores
                    String viewStudent = io.readString("Whose scores would you like to see?");
                    Set<String> studentKey = teacherKey.keySet();
                    for(String currentStudent : teacherKey.keySet()) {
                        ArrayList currentStu = teacherKey.get(viewStudent);
                        io.printArray(currentStu);
                    }
                    
                    break;
                    
                case 5: //View class scores
                    Collection<ArrayList> allScores = teacherKey.values();
                    for (ArrayList list : allScores) {
                        System.out.println(list); //I don't know how to send this to the console
                    }
                    break;
                    
                    
                case 6: //View student average
                    
                    
                    
                case 7: //View class average
                    
                    
                    
                case 8: //View highest scores
                    
                    
                    
                case 9: //View lowest scores                    
                    
                    
                    
                case 10: //Exit
                    repeat = false;
                    break;
        }
                    
        
        
        
        
        
        
        
//        ArrayList<Integer> adamScores = new ArrayList<>();
//        adamScores.add(90);
//        adamScores.add(100);
//        adamScores.add(90);
//        teacherKey.put("Adam", adamScores);
//        
//        ArrayList<Integer> billScores = new ArrayList<>();
//        billScores.add(80);
//        billScores.add(60);
//        billScores.add(80);
//        teacherKey.put("Bill", billScores);
//        
//        
//        System.out.println("There are " + teacherKey.size() + " students.");
//        
//        Set<String> keys = teacherKey.keySet();
//        
//        System.out.println("--- Students ---");
//        for (String k : keys) {
//            System.out.println(k + "'s quiz score is " + teacherKey.get(k));
//        }
        
    }
    }
    
}
