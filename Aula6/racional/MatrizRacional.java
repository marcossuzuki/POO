package racional;

public class MatrizRacional {

    private NumeroRacional matriz[][];
    private static int tamanho = 3;

    public MatrizRacional() throws Exception{
        this(tamanho, tamanho++);
    }

    public MatrizRacional(int x, int y) throws Exception{
        matriz = new NumeroRacional[x][y];
        preencherAleatorio();
    }

    public void preencherAleatorio() throws Exception{
        for(int i=0; i<matriz.length; i++)
            for(int j=0; j<matriz[i].length; j++){
                matriz[i][j] = new NumeroRacional();
            }
    }

    public void soma(MatrizRacional m) throws Exception{
        if((matriz.length != m.matriz.length) && (matriz[0].length != m.matriz[0].length))
            throw new Exception("Matrizes de tamanhos diferentes.");
        for(int i=0; i<matriz.length;i++) {
            for(int j=0; j<matriz[i].length; j++) {
                matriz[i][j].soma(m.matriz[i][j]);
            }
        }
    }

    public void imprimir() {
        for(int i=0; i<matriz.length;i++) {
            for(int j=0; j<matriz[i].length; j++) {
                System.out.print(matriz[i][j].getString() + " ");
            }
            System.out.println();
        }

    }

}