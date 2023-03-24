import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

class date {
  private int day, month, year;

  date(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  int getDay() {
    return this.day;
  }

  int getMonth() {
    return this.month;
  }

  int getYear() {
    return this.year;
  }

  void setDay(int day) {
    this.day = day;
  }

  void setMonth(int month) {
    this.month = month;
  }

  void setYear(int year) {
    this.year = year;
  }

  void displayDate() {
    System.out.println("Date: " + this.day + "/" + this.month + "/" + this.year);
  }
}

class makeDate {
  public static void main(String args[]) {
    try {
      // create file
      File newFile = new File("dateTest.txt");
      newFile.createNewFile();
    } catch (Exception e) {
      System.out.println("File cannot created");
    }

    // put content in file
    try {
      // make instance of writer
      FileWriter filewriter = new FileWriter("dateTest.txt");

      // write
      filewriter.write("18 2 2022\n");
      filewriter.write("1 2 2023\n");
      filewriter.write("3 3 2023");

      // close
      filewriter.close();
    } catch (Exception e) {
      System.out.println("unable to write in file");
    }

    // read file
    try {
      // get file
      File fileRead = new File("dateTest.txt");

      // make reader scanner
      Scanner lineReader = new Scanner(fileRead);

      // traverse each line
      while (lineReader.hasNext()) {

        // get date
        int day = Integer.parseInt(lineReader.next()), month = Integer.parseInt(lineReader.next()),
            year = Integer.parseInt(lineReader.next());
        date d1 = new date(day, month, year);
        System.out.print("Initial ");
        d1.displayDate();

        d1.setDay(12);
        d1.setMonth(3);
        d1.setYear(2023);
        System.out.println("Final Date: " + d1.getDay() + "/" + d1.getMonth() + "/" +
            d1.getYear());
      }
      // close reader
      lineReader.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}