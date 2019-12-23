import users.Staff;
import users.Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class addUsers {
    public static Student[] addStudents(String fileName, int number){
        try{
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            Student[] team = new Student[number];
            int counter = 0;
            while(line != null){
                String[] parser = line.split(" ");
                team[counter] = new Student(parser[1], parser[0], parser[2], Integer.parseInt(parser[3]));
                line = reader.readLine();
                counter++;
            }
            return team;
        }catch (IOException ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }
    public static Staff[] addStaff(String fileName, int number){
        try{
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            Staff[] staff = new Staff[number];
            int counter = 0;
            while(line != null){
                String[] parser = line.split(" ");
                staff[counter] = new Staff(parser[1], parser[0], parser[2]);
                line = reader.readLine();
                counter++;
            }
            return staff;
        }catch (IOException ex){
            System.out.println(ex.getMessage());
            return null;
        }
    }
}
