package TermProject2;

import java.util.Scanner;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HumanResources {
    Scanner scanner = new Scanner(System.in);
    Pattern patternNum = Pattern.compile("^[0-9]*$");
    Vector<Employee> vectorEmployee = new Vector<>();
    Vector<Department> vectorDepartment = new Vector<>();

    public void init() {
        /*if (저장된 데이터가 있으면)
            로드;
        else { 없으면 새로 만든다 */
            Employee boss = new Employee("사장님",Position.STAFF);
            vectorEmployee.add(boss);

            Employee secretaryM = new Employee("비서실 매니저",Position.MANAGER);
            vectorEmployee.add(secretaryM);
            Employee generalAffairsM = new Employee("총무팀 매니저",Position.MANAGER);
            vectorEmployee.add(generalAffairsM);
            Employee humanResourceM = new Employee("인사팀 매니저",Position.MANAGER);
            vectorEmployee.add(humanResourceM);
            Employee dev1M = new Employee("개발1팀 매니저",Position.MANAGER);
            vectorEmployee.add(dev1M);
            Employee dev2M = new Employee("개발2팀 매니저",Position.MANAGER);
            vectorEmployee.add(dev2M);
            Employee dev3M = new Employee("개발3팀 매니저",Position.MANAGER);
            vectorEmployee.add(dev3M);

            Employee secretaryE = new Employee("비서1",Position.STAFF);
            vectorEmployee.add(secretaryE);
            Employee generalAffairsE = new Employee("총무1",Position.STAFF);
            vectorEmployee.add(generalAffairsE);
            Employee humanResourceE = new Employee("인사1",Position.STAFF);
            vectorEmployee.add(humanResourceE);
        Employee dev1E = new Employee("개발1팀 1",Position.SW_DEV);
        vectorEmployee.add(dev1E);
        Employee dev2E = new Employee("개발2팀 1",Position.SW_DEV);
        vectorEmployee.add(dev2E);
        Employee dev3E = new Employee("개발3팀 1",Position.SW_TESTER);
        vectorEmployee.add(dev3E);

        Department secretaryD = new Department("비서실",secretaryE,secretaryM);
        vectorDepartment.add(secretaryD);
        Department generalAffairsD = new Department("총무팀",generalAffairsE,generalAffairsM);
        vectorDepartment.add(generalAffairsD);
        Department humanResourceD = new Department("인사팀",humanResourceE,humanResourceM);
        vectorDepartment.add(humanResourceD);
        Department dev1D = new Department("개발1팀",dev1E,dev1M);
        vectorDepartment.add(dev1D);
        Department dev2D = new Department("개발2팀",dev2E,dev2M);
        vectorDepartment.add(dev2D);
        Department dev3D = new Department("개발3팀",dev3E,dev3M);
        vectorDepartment.add(dev3D);

        //}
    }

    public void menu() {
        System.out.println("#### 인적 자산 관리 ####");
        do {
            System.out.println("1. 전체 직원 출력");
            System.out.println("2. 신규 직원 등록");
            System.out.println("3. 직원 정보 삭제");
            System.out.println("4. 직원 정보 수정");
            System.out.println("5. 직원 검색");
            System.out.println("6. 로그 출력");
            System.out.println("7. 복구 지점 저장");
            System.out.println("8. 복구 실행");
            System.out.print("선택: ");

            String stringInput = scanner.nextLine();
            Matcher matcherNum = patternNum.matcher(stringInput);
            int intInput = matcherNum.find() ? Integer.parseInt(stringInput) : 0;

            switch (intInput) {
                case 1: // 출력

                    break;
                default:
                    System.out.println("<올바른 입력이 아닙니다.>\n");
                    break;
            }
        } while (true);
    }
}
