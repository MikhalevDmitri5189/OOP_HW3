
    import java.io.IOException;

    public class Main {

        public static void main(String[] args){

            Student st1 = new Student("SurnameH", "NameJ", true, 3, 1180, 5.0, 22, 175, 70);
            Student st2 = new Student("SurnameJ", "NameL", true, 3, 1121, 4.5, 20, 172, 77);
            Student st3 = new Student("SurnameF", "NameD", true, 3, 1172, 4.0, 17, 181, 81);
            Student st4 = new Student("SurnameB", "NameA", true, 3, 1133, 3.5, 21, 164, 90);
            Student st5 = new Student("SurnameA", "NameN", true, 3, 1144, 3.5, 23, 190, 120);
            Student st6 = new Student("SurnameQ", "NameG", false, 3, 1655, 5.0, 20, 167, 55);
            Student st7 = new Student("SurnameI", "NameB", false, 3, 1196, 4.7, 16, 151, 45);
            Student st8 = new Student("SurnameC", "NameD", false, 3, 1137, 4.6, 23, 183, 90);
            Student st9 = new Student("SurnameD", "NameF", false, 3, 1128, 4.0, 25, 169, 60);

            System.out.println();

            Group group = new Group("JAVA#1");
            group.addStudent(st1);
            group.addStudent(st2);
            group.addStudent(st3);
            group.addStudent(st4);
            group.addStudent(st5);
            group.addStudent(st6);
            group.addStudent(st7);
            group.addStudent(st8);
            group.addStudent(st9);

            System.out.println();

            try {
                group.printGroupToFile("GroupFolder");
                Group groupFromFile = Group.redGroupFromFile("GroupFolder/stgroup.txt");
                System.out.println(groupFromFile);
                System.out.println(group);
            }
            catch (IOException e){
                System.out.println(e);
            }
        }

        public static void sendInviteToArmy(Voenkom soldierGroup){ //Военкомат рассматривает группу студентов как группу военно обязанных
            Soldier[] soldierArr = soldierGroup.getStudentValidForArmy(); //Группу годных служить как солдат
            for(Soldier soldier: soldierArr){
                soldier.messageFromVoenkom(); //И приглашает всех солдат вступить в ряды армии
            }
        }
    }


