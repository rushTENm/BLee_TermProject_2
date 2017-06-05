package TermProject2;

import java.util.Vector;

public class Department {
    String name;
    Vector<Employee> vectorMember;
    Employee manager;

    public Department(String name, Employee member, Employee manager) {
        this.name = name;
//        vectorMember.add(member);
        if (manager.getPosition() == Position.MANAGER) {
            this.manager = manager;
        } else {
            System.out.println(name + " 매니저 오류로 생성 실패");
        }
    }

    public String getName() {
        return name;
    }

    public Vector<Employee> getVectorMember() {
        return vectorMember;
    }

    public Employee getManager() {
        return manager;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public void addMember(Employee member) {
//        vectorMember.add(member);
    }
}
