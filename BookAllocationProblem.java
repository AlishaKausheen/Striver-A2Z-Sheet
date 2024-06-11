
//array contains number of pages of each book
//number of students are given allocate book
//each student gets atleast one book
//one book can not be allocated to more than one student
//book allocation should be in contageous manner
//find maximum number of pages allocated to student is minimum
public class BookAllocationProblem {
    public static void main(String[] args) {
      int[] book = {25,46,28,49,24};
      int students =4;
      System.out.println(brute(book,students));
      System.out.println(optimal(book,students));
    }

    public static int max(int[] book){
        int maxi=-1;
        for (int i=0;i< book.length;i++){
            maxi =Math.max(maxi,book[i]);
        }
        return maxi;
    }
    public static int sum(int[] book){
        int sum =0;
        for (int i=0;i<book.length;i++){
            sum+=book[i];
        }
        return sum;
    }

    public static int countStudent(int[] book, int pages){
     int stu =1, pagesStudent=0;
     for (int i=0;i<book.length;i++){
         if(pagesStudent+book[i]<=pages){
             pagesStudent+=book[i];
         }else {
             stu++;
             pagesStudent=book[i];
         }
     }
     return stu;
    }
    static int brute(int[] book, int students){
        if (book.length<students){
            return -1;
        }
        for (int pages = max(book);pages<=sum(book);pages++){
            int calStudent = countStudent(book,pages);
            if (calStudent==students){
                return pages;
            }
        }


        return -1;
    }
    static int optimal(int[] book,int students){
        int low = max(book), high = sum(book);
        while (low<=high){
            int mid = low+(high-low)/2;
            if(countStudent(book,mid)>students){
                low=mid+1;
            }else if (countStudent(book,mid)<students){
                high=mid-1;
            }else {
                return mid;
            }
        }//low can also be answer

        return -1;
    }
}
