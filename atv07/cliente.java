package atv07;



    public class cliente {
        private String nome;
        private TipoPagamento tipoPagamento;
    
        public cliente(String nome, TipoPagamento tipoPagamento) {
            this.nome = nome;
            this.tipoPagamento = tipoPagamento;
        }
    
        public String getNome() {
            return nome;
        }
    
        public TipoPagamento getTipoPagamento() {
            return tipoPagamento;
        }
    }
     

