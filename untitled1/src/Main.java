public class Main {
    public static void main(String[] args) {
        User[] users = new User[15];

        users[0] = new User(1, "user1", "pass1", "Ivan", "Ivanov");
        users[1] = new User(2, "user2", "pass2", "Petr", "Petrov");
        users[2] = new User(3, "user3", "pass3", "Sidor", "Sidorov");
        users[3] = new User(4, "user4", "pass4", "Anna", "Smirnova");
        users[4] = new User(5, "user5", "pass5", "Elena", "Kuznetsova");

        users[5] = new Student(6, "stud1", "pass6", "Masha", "Ivanova", 3.5);
        users[6] = new Student(7, "stud2", "pass7", "Oleg", "Semenov", 4.0);
        users[7] = new Student(8, "stud3", "pass8", "Nina", "Popova", 3.2);
        users[8] = new Student(9, "stud4", "pass9", "Igor", "Orlov", 3.9);
        users[9] = new Student(10, "stud5", "pass10", "Katya", "Morozova", 4.2);

        ((Student) users[5]).addCourse("Math");
        ((Student) users[5]).addCourse("Physics");

        ((Student) users[6]).addCourse("Chemistry");
        ((Student) users[6]).addCourse("Biology");

        ((Student) users[7]).addCourse("Literature");

        ((Student) users[8]).addCourse("History");
        ((Student) users[8]).addCourse("Geography");

        ((Student) users[9]).addCourse("English");
        ((Student) users[9]).addCourse("Programming");

        users[10] = new Staff(11, "staff1", "pass11", "Dmitry", "Fedorov", 150000);
        users[11] = new Staff(12, "staff2", "pass12", "Alina", "Koval", 120000);
        users[12] = new Staff(13, "staff3", "pass13", "Roman", "Belov", 130000);
        users[13] = new Staff(14, "staff4", "pass14", "Tatyana", "Lebedeva", 110000);
        users[14] = new Staff(15, "staff5", "pass15", "Viktor", "Nikolaev", 140000);

        ((Staff) users[10]).addSubject("Algebra");
        ((Staff) users[10]).addSubject("Geometry");

        ((Staff) users[11]).addSubject("Biology");

        ((Staff) users[12]).addSubject("Informatics");

        ((Staff) users[13]).addSubject("Physics");

        ((Staff) users[14]).addSubject("Russian");
        ((Staff) users[14]).addSubject("Literature");

        for (User user : users) {
            System.out.println("========");
            user.getData();
        }
    }
}
