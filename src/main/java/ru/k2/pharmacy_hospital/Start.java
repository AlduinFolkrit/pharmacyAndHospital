package ru.k2.pharmacy_hospital;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.k2.pharmacy_hospital.domain.Person;


public class Start {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");

        Person person = (Person) context.getBean("person");
        person.hello();
//        try {
//            Class.forName("org.postgresql.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

//        String log, pass;
//        Scanner sc = new Scanner(System.in);
//        RegisterChecker checker = new RegisterChecker();
//
//        System.out.println("To continue working with the program please enter log in");
//        System.out.print("Login: > ");
//        log = sc.next();
//        System.out.print("Password: >");
//        pass = sc.next();
//
//        Person person = checker.login(log, pass);
//
//        if (person instanceof PharmacyAdministrativeRole) {
//
//            PharmacyAdministrativeRole staff = (PharmacyAdministrativeRole) person;
//
//            staff.addDrug();
//
//        } else if (person instanceof PharmacyClient) {
//
//            PharmacyClient pharmacyUser = (PharmacyClient) person;
//
//            pharmacyUser.getDescription(sc.next());
//
//            pharmacyUser.searchDrugByName(sc.next());
//        }
//        } else if (person instanceof HospitalUser) {
//            System.out.println("i am a hospital user");
//
//            HospitalUser hospitalUser = (HospitalUser) person;
//
//            hospitalUser.getDescription("Шприц");
//            hospitalUser.searchDrugByName("Эспумизан");
//        }
//         else
//            checker.register();
    }
}