package TermProject2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee {
    static int totalNum = 0;
    int idNum;
    String name;
    Position position;
    Department department;

    Scanner scanner = new Scanner(System.in);

    public Employee(String name, Position position) {
        this.name = name;
        this.position = position;
        totalNum++;
        idNum = totalNum;
    }

    public int getIdNum() {
        return idNum;
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public Department getDepartment() {
        return department;
    }

    public void setName() {
        Pattern patternKorean = Pattern.compile("^[가-힣0-9 ]{1,17}$");
        Pattern patternRoman = Pattern.compile("^[a-z A-Z0-9,.'-]+$");

        while (true) {
            System.out.print("  이름 : ");
            String input = scanner.nextLine();
            Matcher matcherKorean = patternKorean.matcher(input);
            Matcher matcherRoman = patternRoman.matcher(input);

            if (matcherKorean.find() || matcherRoman.find()) {
                this.name = input;
                break;
            } else
                System.out.println("올바른 이름을 입력하세요");
        }
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
