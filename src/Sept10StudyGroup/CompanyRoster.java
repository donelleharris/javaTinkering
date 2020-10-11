package Sept10StudyGroup;

public class CompanyRoster implements Formatter {

    public static String display(Employee employee) {
        return String.format(
                "Sept10StudyGroup.Employee-Name: %s\n" +
                "Sept10StudyGroup.Employee-Email: %s", employee.getName(), employee.getEmail()
        );
    }
}
