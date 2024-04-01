package controller;

public class Erros extends Exception {
    public static class PilhaVaziaException extends Exception 
    {
        public PilhaVaziaException(String message) 
        {
            super(message);
        }
    }

    public static class OperacaoInvalidaException extends Exception 
    {
        public OperacaoInvalidaException(String message) 
        {
            super(message);
        }
    }

    public static class DivisaoPorZeroException extends Exception 
    {
        public DivisaoPorZeroException(String message) 
        {
            super(message);
        }
    }
}
