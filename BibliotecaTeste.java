import java.util.Scanner;
public class TesteBiblioteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Biblioteca!\n");
        System.out.print("Digite o título do material requerido: \n");
        String titulo = scanner.nextLine();
        System.out.print("Digite o ano de publicação do material solicitado: \n");
        int anoPublicacao = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o tipo de masterial de leitura, livro ou revista: ");
        String tipoMaterial = scanner.nextLine();

        Material material;

        if (tipoMaterial.equalsIgnoreCase("Livro")) {
            material = new Material(titulo, anoPublicacao);
        } else if (tipoMaterial.equalsIgnoreCase("Revista")) {
            material = new Material(titulo, anoPublicacao);
        } else {
            System.out.println("Material inválido.");
            return;
        }

        System.out.print("Digite se deseja o material a curto prazo ou longo prazo: \n");
        String TipoEmprestimo = scanner.nextLine();

        TipoEmprestimo tipo;

        if (TipoEmprestimo.equalsIgnoreCase("Curto")) {
            tipo = TipoEmprestimo.curto_prazo;
        } else if (TipoEmprestimo.equalsIgnoreCase("Longo")) {
            tipo = TipoEmprestimo.longo_prazo;
        } else {
            System.out.println("Tipo de empréstimo inválido.");
            return;
        }

        System.out.print("Por favor, digite a quantidade de dias de atraso do material: ");
        int atraso = scanner.nextInt();

        Emprestimo emprestimo = new Emprestimo(material, tipo);

        System.out.println("Empréstimo realizado com sucesso:");
        System.out.println("Título do material: " + emprestimo.getMaterial().getTitulo());
        System.out.println("Ano de publicação do material: " + emprestimo.getMaterial().getAnoPublicacao());
        System.out.println("Tipo de empréstimo: " + emprestimo.getTipo());
        System.out.println("Total de multa por atraso: $" + emprestimo.Multa(atraso));
    }
}