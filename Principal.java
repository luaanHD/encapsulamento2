public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Luan");
        System.out.println(pessoa.getNome());

        pessoa.setIdade(17);
        System.out.println(pessoa.getIdade());

        pessoa.setCelular("(18)99769-7463");
        System.out.println(pessoa.getCelular());

        pessoa.setCpf("440.619.918-76");
        System.out.println(pessoa.getCpf());
    }
}
