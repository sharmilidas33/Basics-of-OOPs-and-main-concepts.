class MaxMarks{
    public static void main(String[] args) {
        //Find Max Element
        int marks[]={23,14,86,98,56,36};
        int max_marks= marks[0];
        for(int i=1;i<marks.length;i++){
            if(max_marks<marks[i]){
                max_marks=marks[i];
            }
        }
        System.out.println("Max Marks is "+max_marks);
    }
}