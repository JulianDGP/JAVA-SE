public class BucleEtiquetas
{
    public static void main(String[] args) {
       buclebuscar: for(int i =0; i<5; i++){
            if (i == 2) {
                continue buclebuscar;
            }
        }
    }
}
