package Sept10StudyGroup;

import Sept10StudyGroup.CompanyRoster;

public class studyGroup10SeptMain {
    public static void main(String[] args) {
        Employee sara = new Employee("Sara", "sara.wilson@company.com");
        System.out.println(CompanyRoster.display(sara));
    }

}
