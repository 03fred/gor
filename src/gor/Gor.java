package gor;

import java.io.PrintStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Gor {
    
    public static Path way;
    public static Charset codif = StandardCharsets.UTF_8;
    
    public static void main(String[] args) {
    ValidacaoCamposEntrada validacaoCamposEntrada = new ValidacaoCamposEntrada();
    	Scanner leia = new Scanner(System.in);
        Cliente acao = new Cliente();
        String str = "";
        Alimento acaoAlimento = new Alimento();
        //  ArrayList<Cliente> clientes = new ArrayList<Cliente>();//declaracao do ArrayList
        //ArrayList<Alimento> alimentos = new ArrayList<>();
        String nomecliente, emailcliente;
        String tipoCliente, tipoAlimento;
        
        int opc = 0;
        try {
            do {
            	//painel mais limpo para melhor organização
            	String opcao = JOptionPane.showInputDialog("============================= MENU PRINCIPAL ===================================\");\r\n"
            			+"1- Criar\n"
            			+"2- Abrir \n"
            			+"3- Guardar\n"
            			+"4- Guardar como...\n"
            			+"5- Gestão de Clientes \n"
            			+"6- Gestão de Alimentos\n"
            			+"7- Gestão de Restaurantes\n"
            			+"8- Gestão de Restaurante\n"
            			+"9- Sair ");
               
            	try {
            		
            		opc = Integer.parseInt(opcao);
            	}catch(NumberFormatException nb) {
            		
            	}
                
                switch (opc) {
                    
                    case 1: //CRIAR FICHEIRO
                        /*System.out.println("===================Criar===================");
                    System.out.println("Insira o nome do ficheiro que pretendes criar: ");
                    String nomeFicheiro = leia.next();
                    if ("certo".equalsIgnoreCase(novoFicheiro(nomeFicheiro))){
                        System.out.println("Ficheiro criado com exito!");
                    } else {
                        System.out.println("Erro. (-_-)");
                    }*/
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                    case 4:
                        
                        break;
                    
                    case 5://GESTAO DE CLIENTES
                        System.out.println("\t\t\t\t\t\t\t\t============================= GESTÃO DE CLIENTES ===================================");
                        System.out.println("\t\t\t\t\t\t\t\t\t1- Visualisar Todos Clientes \t\t\t\t2-Regitar Novo Cliente\n\t\t\t\t\t\t\t\t\t"
                                + "3- Alterar Tipo de Cliente \t\t\t\t4-Escrever Lista de Alera"
                                + "\n\t\t\t\t\t\t\t\t\t5- Desinscrever Lista de Alerta\t\t\t6- Listar mensagens de alerta recebidas\n\t\t\t\t\t\t"
                                + "\t\t\t7- Sair");
                        System.out.println("\t\t\t\t\t\t\t\t================================================================================\n");
                        System.out.print("\t\t\t\t\t\t\t\t\tselecione:");
                        opc = leia.nextInt();
                        
                        switch (opc) {
                            case 1: //listar clientes 
                                System.out.println("\t\t\t============================= VISUALIZAR CLIENTES  ===================================");
                               /* for (Cliente view : cliente.clientes) {
                                    // System.out.println(view.getTipoClient() + "|" + view.getNome() + "|" + view.getEmail());
                                    System.out.println(view);
                                }*/
                                acao.listarCliente();
                                break;
                            case 2: //REGISTAR CLIENTES
                                Cliente cliente = new Cliente();
                                System.out.println("\t\t\t\t\t\t\t\t============================= REGISTAR CLENTES ===================================");
                                boolean c;
                                System.out.println("Entre com o Tipo de Clinte");
                                cliente.setTipoClient(tipoCliente = leia.next());
                                c = cliente.tipoCliente(cliente.getTipoClient());
                                while (c == false) {
                                    System.out.println("Tipo inválido! Escreva OMNIVOROUS ou VEGETARIAN");
                                    cliente.setTipoClient(leia.next());
                                    c = cliente.tipoCliente(cliente.getTipoClient());
                                }
                                System.out.println("Entre com o Nome:  ");
                                cliente.setNome(leia.next());
                                boolean email;
                                System.out.println("Entre Com Email@:  ");
                                cliente.setEmail(leia.next());
                                email = cliente.validEmail(cliente.getEmail());
                                while (email == false) {
                                    cliente.setEmail(leia.next());
                                    email = cliente.validEmail(cliente.getEmail());
                                }
                                //cliente.setNome(nomecliente);
                                acao.inserePessoa(cliente);
                                System.out.println("Inserido com Sucesso!");
                                //cliente.clientes.add(cliente);
                                break;
                            case 3:
                                System.out.println("Entre comonumerodocliente que deseja alterar");
                                int indice =leia.nextInt();
                                System.out.println("Etre com o tipo de Cliente OMNIVOROUS OU VEGETARIAN");
                                String tipo =leia.next();
                                c = acao.tipoCliente(tipo);
                                while (c == false) {
                                    System.out.println("Tipo inválido! Escreva OMNIVOROUS ou VEGETARIAN");
                                    tipo = leia.next();
                                    c = acao.tipoCliente(tipo);
                                }
                                acao.alteratTipoCliente(indice, tipo);
                                System.out.println("Tipo de Cliente alteradocom Sucesso!");
                                
                                break;
                        }
                        
                        break;
                    case 6:
                        System.out.println("\t\t\t============================= GESTÃO DE ALIMENTOS ===================================");
                        System.out.println("\t\t\t\t1- Visualizar Alimentos \t\t\t\t2- Registar Alimentos\n\t\t\t\t"
                                + "3- Registar Alimento Simples \t\t\t\t4- Registar Alimento Agregado"
                                + "\n\t\t\t\t5- Alterar Alimento Simples\t\t\t6- Descrever Agregado\n\t\t"
                                + "\t\t7- Sair");
                        System.out.println("\t\t\t================================================================================\n");
                        System.out.print("\t\t\tselecione:");
                        opc = leia.nextInt();
                        switch (opc) {
                            case 1: //Visualização
                                System.out.println("\t\t\t============================= VISUALIZAR ALIMENTOS ===================================");
                                acaoAlimento.listarAlimento();
                                break;
                            case 2:
                               /* System.out.println("\t\t\t============================= REGISTAR ALIMENTOS ===================================");
                                boolean a;
                                System.out.println("Entre comotipo de alimento: ");
                                alimento.setTipoAlimento(leia.next());
                                a = alimento.validarAlimento(alimento.getTipoAlimento());
                                while (a == false) {
                                    System.out.println("Tipo de Alimento Invalido Escreva Agregado ou Simples");
                                    alimento.setTipoAlimento(leia.next());
                                    a = alimento.validarAlimento(alimento.getTipoAlimento());                                                                    
                                    
                                }
                                if (alimento.getTipoAlimento().equalsIgnoreCase("Simples"))
                                    System.out.println("Entre com o nome do Alimento Simples");
                                        alimento.setNome(leia.next());*/
                                break;
                            case 3:
                                System.out.println("\t\t\t============================= Registar Alimentos Simples ===================================");
                               
                                Alimento alimento = new Alimento();
                                //Instrucoes
                                boolean al;
                                System.out.println("Entre com o Tipo de Clinte");
                                alimento.setTipoAlimento(tipoAlimento = leia.next());
                                al = alimento.tipoAlimento(alimento.getTipoAlimento());
                                while (al == false) {
                                    System.out.println("Tipo inválido! Escreva OMNIVOROUS ou VEGETARIAN");
                                    alimento.setTipoAlimento(leia.next());
                                    al = alimento.tipoAlimento(alimento.getTipoAlimento());
                                }
                                System.out.println("Entre com nome do Alimento");
                                alimento.setNome(leia.next());
                                System.out.println("Entre com As Calorias do Alimento");
                                alimento.setCalorias(leia.nextFloat());
                                acaoAlimento.isereAlimento(alimento);
                                break;
                            case 4:
                                System.out.println("\t\t\t============================= REGISTAR ALIMENTO AGREGADO ===================================");
                               while(true) {
                                Alimento alimentoagregado =new Alimento();
                                
                                //entrar com o nome do alimento
                                str = JOptionPane.showInputDialog("entre com o nome do alimento");
                               //verifica se a string esta vazia
                                while(validacaoCamposEntrada.validacaoString(str)){
                                alimentoagregado.setNomeagregado(leia.next());
                                
                                }
                                //chama o painel de porcentagem
                                str = JOptionPane.showInputDialog("entre com a porcentagem");
                                //método while verifica se o campo contém letras
                                while(!validacaoCamposEntrada.validacaoDouble(str) && str !=null) {
                                    alimentoagregado.setPercentagem(leia.nextFloat());
                                    }
                                str = JOptionPane.showInputDialog("deseja finalizar o pedido?\n "
                                		+ "Para finalizar apenas clicke ok");
                                if(str.isEmpty())System.exit(0);
                                
                                }
                               
                            case 5:
                                System.out.println("\t\t\t============================= ALTERAR ALIMENTO SIMPLES ===================================");

                                //INSTRUCOES
                                break;
                            case 6:
                                System.out.println("\t\t\t============================= DESVREVER ALIMETO AGREGADO ===================================");
                                //INSTRUCOEE
                                break;
                        }
                        
                        break;
                    
                    default:
                        System.out.println("\t\t\t\t\t\t\t\tOPÇÃO INVALIDA ESCOLHE UMA OPÇÃO VÁLIDA 1-8");
                    
                }
            } while (opc != 9);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        //Criar Novo ficheiro
        /*  public static String novoFicheiro(String nomeFicheiro) throws IOException{
        way = Paths.get("C:/Users/Tayson/Desktop/PooJava" + nomeFicheiro + ".txt");
        Files.createFile(way);
        //contWay++;
        return "certo";
    }*/
    }
    
}
