/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class TestUserProfile {
 
        public static void main (String[] args){
            Scanner input = new Scanner(System.in);
            
            String name;
            String genre;
            String[] genres =  {"Comedy", "Drama", "Action", "Mystery"};
            
            System.out.println("enter name");
            name = input.nextLine();
            
            System.out.println("Which of the following genres is your favourite?");
            for (int i = 0; i < genres.length; i++){
                System.out.print(genres[i] + " ");
            }
            System.out.println();
            genre = input.nextLine();
            
            UserProfile user = new UserProfile(name, genre);
            user.setUserID(name);
            user.setGenre(genre);
            
            System.out.printf("Account created: Name: %s Genre: %s", 
                    user.getUserID(), user.getGenre());
        }
}
