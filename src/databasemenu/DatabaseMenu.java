/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package databasemenu;
import java.sql.*;
import java.util.Scanner;

/**
 *
 *
 * @author Diego Gosalvez
 * 2023192
 * 07-01-2024
 */
public class DatabaseMenu {
       /**
     * @param args the command line arguments
     */
public static void main(String[] args) {

     // Connect to the database
    String url = "jdbc:mysql://localhost:3306/mydatabase";
    String username = "root";
    String password = "1989-GosalvezDiego";
    
    try {
      Connection connection = DriverManager.getConnection(url, username, password);
      System.out.println("Connected to the database");
      
      // Display menu
      displayMenu();
      
      // Read user input
      Scanner scanner = new Scanner(System.in);
      int choice = scanner.nextInt();
      
      while (choice != 0) {
        switch (choice) {
          case 1:
            // Execute query 1
            executeQuery1(connection);
            break;
          case 2:
            // Execute query 2
            executeQuery2(connection);
            break;
          case 3:
            // Execute query 3
            executeQuery3(connection);
            break;
          case 4:
            // Execute query 4
            executeQuery4(connection);
            break;
          case 5:
            // Execute query 5
            executeQuery5(connection);
            break;
          case 6:
            // Execute query 6
            executeQuery6(connection);
            break;
          case 7:
            // Execute query 7
            executeQuery7(connection);
            break;
          case 8:
            // Execute query 8
            executeQuery8(connection);
            break;
          case 9:
            // Execute query 9
            executeQuery9(connection);
            break;
          case 10:
            // Execute query 10
            executeQuery10(connection);
            break;
          default:
            System.out.println("Invalid option. Please try again.");
            break;
        }
        
        // Display menu
        displayMenu();
        
        // Read user input
        choice = scanner.nextInt();
      }
      
      // Close the connection
      connection.close();
      System.out.println("Disconnected from the database");
    } catch (SQLException e) {
      System.out.println("Error connecting to the database: " + e.getMessage());
    }
  }
  
  public static void displayMenu() {
    System.out.println("Menu:");
    System.out.println("1. List all captains with their first name, last name, and team");
    System.out.println("2. List positions available");
    System.out.println("3. List football players' names ordered alphabetically for a particular team");
    System.out.println("4. List how many teams won, lost, or drew on the last matchday");
    System.out.println("5. List football players that lost the first matchday sorted by skill level");
    System.out.println("6. List football players with a low skill that had an injury");
    System.out.println("7. List how many players had more than one injury");
    System.out.println("8. List the most common injuries");
    System.out.println("9. List the match with the most draws and the teams that drew");
    System.out.println("10. List the number of players with low, medium, and high skill level grouped by team");
    System.out.println("0. Exit");
    System.out.print("Enter your choice: ");
  }
  
  public static void executeQuery1(Connection connection) {
    try {
      Statement statement = connection.createStatement();
      ResultSet resultSet = statement.executeQuery("SELECT player_id, first_name, last_name, team_name FROM player WHERE captain = 1");
      
      while (resultSet.next()) {
        int playerId = resultSet.getInt("player_id");
        String firstName = resultSet.getString("first_name");
        String lastName = resultSet.getString("last_name");
        String teamName = resultSet.getString("team_name");
        
        System.out.println("Player ID: " + playerId);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Team Name: " + teamName);
        System.out.println();
      }
      
      resultSet.close();
      statement.close();
    } catch (SQLException e) {
      System.out.println("Error executing query 1: " + e.getMessage());
    }
  }
  
  // Implement executeQuery2, executeQuery3, executeQuery4, executeQuery5, executeQuery6, executeQuery7, executeQuery8, executeQuery9, executeQuery10 methods

    private static void executeQuery2(Connection connection) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
  
}
    
  
    
    
        
        
        
    
        
    }
    
    
    
    
    
    
        
    
    
