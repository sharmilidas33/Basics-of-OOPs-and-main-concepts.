public class AvgMarks {
    public static void main(String[] args) {
        int marks[]={3,7,8,1,9};
        int avg_marks=0;
        for(int i=1;i<marks.length;i++){
            avg_marks+= marks[i];
        }
        System.out.println("Average marks: "+avg_marks/marks.length);
    }
}
