$ mkdir repo_cleanup
$ cd repo_cleanup
$ git clone https://github.com/YOUR-USERNAME/YOUR-REPOSITORY .
$ git filter-branch --force --index-filter \
 "git rm --cached --ignore-unmatch key.txt" \
 --prune-empty --tag-name-filter cat -- --all
$ echo "key.txt" >> .gitignore
$ git add .gitignore
$ git commit -m "Add key.txt to .gitignore"
$ git push origin --force --all
$ git push origin --force --tags

public class HW6_1 {

    //array toString method
    public static void printArray(int[] arr){ //input is an int array
        for(int i = 0; i < arr.length; i++){ //iterates through indices
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //remove
    public static int[] remove(int[] arr, int removeIndex){
        int[] result = new int[arr.length - 1];

        if(removeIndex < 0 || removeIndex >= arr.length){
            return arr;
        }

        for(int i = 0; i < removeIndex; i++){
            result[i] = arr[i];
        }
        for(int i = removeIndex + 1; i < arr.length; i++){
            result[i - 1] = arr[i];
        }

        return result;
    }

    //replace
    public static void replace(int[] arr, int newVal, int index){
        arr[index] = newVal;
        printArray(arr);
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};

        printArray(remove(a, 2));
        replace(a, 10 ,3);
    }
}
