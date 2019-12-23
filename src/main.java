import users.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class main {
    public static void main(String[] args){
       Student[] students = addUsers.addStudents("src\\students", 27);
       Staff[] staff = addUsers.addStaff("src\\staff", 35);

    }

}
