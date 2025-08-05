public class Gallows {
    private int AttemptsRemaining;

    public Gallows() {
        this.AttemptsRemaining = 5;
    }

    public void error() {
        AttemptsRemaining--;
    }

    public boolean isHanged() {
        return AttemptsRemaining <= 0;
    }

    public int getAttemptsRemaining() {
        return AttemptsRemaining;
    }

    public void showGallows() {
        System.out.println("Tentativas restantes: " + AttemptsRemaining);
        // (Opcional) Adicione um desenho ASCII da forca aqui
    }
}

