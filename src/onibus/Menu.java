package onibus;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Menu {

    public static void main(String[] args) {

        int opcao = 0, n = 0, i = 0, t = 0;
        String val1;
        String val2;
        String val3;
        String val4;
        String val5;
        String val6;

        List<passageiros> lista = new ArrayList<>();
        List<cidades> lista2 = new ArrayList<>();
        List<vender> lista3 = new ArrayList<>();

        while (i != 10) {
            opcao = Integer.parseInt(
                    JOptionPane.showInputDialog("\n\t MENU " + "\n 1 - Cadastrar Passageiro"
                            + "\n 2 - Cadastrar Cidade" + "\n 3 - Vender Passagem"
                            + "\n 4 - Cancelar Passagem" + "\n 5 - Listar Passageiros"
                            + "\n 6 - Listar Cidades" + "\n 7 - Listar Passagens Vendidas"
                            + "\n 8 - Sobre \n 9 - SAIR \n=> OPÇÃO :")
            );

            switch (opcao) {

                case 1: {
                    val1 = JOptionPane.showInputDialog("NOME :");
                    val2 = JOptionPane.showInputDialog("CPF :");
                    lista.add(new passageiros(val1, val2));
                    break;
                }

                case 2: {
                    val1 = JOptionPane.showInputDialog("NOME CIDADE :");
                    val2 = JOptionPane.showInputDialog("ESTADO :");
                    lista2.add(new cidades(val1, val2));
                    break;
                }

                case 3: {
                    val1 = JOptionPane.showInputDialog("NOME :");
                    val2 = JOptionPane.showInputDialog("CPF :");

                    for (passageiros r : lista) {
                        if (r.getNome().equals(val1) && r.getCpf().equals(val2)) {
                            val5 = JOptionPane.showInputDialog("CIDADE DE DESTINO :");
                            for (cidades b : lista2) {
                                if (b.getNomeCidade().equals(val5)) {
                                    val6 = JOptionPane.showInputDialog("CIDADE DE ORIGEM :");
                                    for (cidades y : lista2) {
                                        if (y.getNomeCidade().equals(val6)) {
                                            val3 = JOptionPane.showInputDialog("POLTRONA :");
                                            n = Integer.parseInt(val3);
                                            val4 = JOptionPane.showInputDialog("DATA :");
                                            lista3.add(new vender(val1, val2, val5, val6, n, val4));
                                            t = 8;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (t == 8) {
                        JOptionPane.showMessageDialog(
                                null,
                                "\n\tPASSAGEM CADASTRADA NO SISTEMA ..."
                        );
                        t = 0;
                    } else {
                        JOptionPane.showMessageDialog(
                                null,
                                "\n\tNÃO FOI POSSIVEL CADASTRAR NO SISTEMA ..."
                        );
                    }
                    break;
                }

                case 4: {
                    t = 0;
                    val3 = JOptionPane.showInputDialog("DIGITE O N° DA PASSAGEM A SER RETIRADA :");
                    t = Integer.parseInt(val3);
                    n = lista3.size();

                    if (t <= n) {
                        lista3.remove(t);
                        JOptionPane.showMessageDialog(
                                null,
                                "\n\tPASSAGEM CANCELADA ..."
                        );
                    } else {
                        JOptionPane.showMessageDialog(
                                null,
                                "\n\tPASSAGEM NÃO ENCONTRADA ..."
                        );
                    }
                    break;
                }

                case 5: {
                    JOptionPane.showMessageDialog(
                            null,
                            "\nPASSAGEIROS CADASTRADOS : " + lista.size()
                    );

                    for (passageiros r : lista) {
                        JOptionPane.showMessageDialog(
                                null,
                                "\n" + r
                        );
                    }
                    break;
                }

                case 6: {
                    JOptionPane.showMessageDialog(
                            null,
                            "\nCIDADES CADASTRADAS : " + lista2.size() 
                    );
                    for (cidades b : lista2) {
                        JOptionPane.showMessageDialog(
                                null,
                                "\n" + b
                        );
                    }
                    break;
                }

                case 7: {
                    n = lista3.size() ;
                    for (vender r : lista3) {
                        n = n - 1;
                        JOptionPane.showMessageDialog(
                                null,
                                "\nNUMERO PASSAGEM :" + n + "\n" + r
                        );
                    }
                    break;
                }

                case 8: {
                    JOptionPane.showMessageDialog(
                            null,
                            "\n NOME : Vinicius De Carvalho Bueno"
                            + "\n CODIGO: 828622"
                            + "\n DATA ENTREGA : 22/04/2019"
                    );
                    break;
                }

                case 9: {
                    JOptionPane.showMessageDialog(
                            null,
                            "\n\tPROGRAMA ENCERRADO ..."
                    );
                    i = 10;
                    break;
                }

                default: {
                    JOptionPane.showMessageDialog(
                            null,
                            "\n\tOPÇÃO NÃO ENCONTRADA ..."
                    );
                    break;
                }
            }
        }
    }
}
