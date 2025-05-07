package ch15.sec05.exercise;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
//        if (o1.getName().compareTo(o2.getName()) == 0){
//            return 0;
//        } else if (o1.getName().compareTo(o2.getName()) > 0){
//            return 1;
//        } else {
//            return -1;
//        }
//        if (o1.getId() > o2.getId()){
//            return 1;
//        } else if (o1.getId() < o2.getId()){
//            return -1;
//        } else {
//            return 0;
//        }
        return o1.getGithub().compareTo(o2.getGithub());
    }

}
