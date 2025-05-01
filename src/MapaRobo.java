import java.util.Scanner;

public class MapaRobo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorp1, valorp2, valorp3, valorp4, valorp5;
        String direcao;


        System.out.println("(D)ireita");
        System.out.println("(E)squerda");
        System.out.println("(F)rente");
        System.out.println("(T)rás");
        System.out.print("Escolha a direção em que o Robô andará:");

        direcao = sc.next();
        direcao = direcao.toLowerCase();


        if (direcao.equals("d") || direcao.equals("f") || direcao.equals("t") || direcao.equals("e")) {


            if (direcao.equals("e") || direcao.equals("f") || direcao.equals("t")) {
                System.out.println("Caminho errado, volte do começo e tente outra direção!");
                return;
            } else {
                System.out.print("Digite o valor do primeiro movimento:");
                valorp1 = sc.nextInt();

                if (direcao.equals("d") && !(valorp1 == 5)) {
                    System.out.println("Valor errado! Jogue novamente.");
                    return;
                }


                System.out.println("  " );
                System.out.println("(D)ireita");
                System.out.println("(E)squerda");
                System.out.println("(F)rente");
                System.out.println("(T)rás");
                System.out.print("Escolha a direção em que o Robô andará:");
                direcao = sc.next();
                direcao = direcao.toLowerCase();
                if (direcao.equals("e") || direcao.equals("d") || direcao.equals("f")) {
                    System.out.println("Caminho errado, volte do começo e tente outra direção!");
                    return;
                } else {
                    System.out.print("Digite o valor do segundo movimento:");
                    valorp2 = sc.nextInt();

                    if (direcao.equals("t") && !(valorp2 == 4)) {
                        System.out.println("Valor errado! Jogue novamente.");
                        return;
                    }


                    System.out.println("  " );
                    System.out.println("(D)ireita");
                    System.out.println("(E)squerda");
                    System.out.println("(F)rente");
                    System.out.println("(T)rás");
                    System.out.print("Escolha a direção em que o Robô andará:");
                    direcao = sc.next();
                    direcao = direcao.toLowerCase();
                    if (direcao.equals("e") || direcao.equals("f") || direcao.equals("t")) {
                        System.out.println("Caminho errado, volte do começo e tente outra direção!");
                        return;
                    } else {
                        System.out.print("Digite o valor do terceiro movimento:");
                        valorp3 = sc.nextInt();
                        if (direcao.equals("d") && !(valorp3 == 5)) {
                            System.out.println("Valor errado! Jogue novamente.");
                            return;
                        }


                        System.out.println("  " );
                        System.out.println("(D)ireita");
                        System.out.println("(E)squerda");
                        System.out.println("(F)rente");
                        System.out.println("(T)rás");
                        System.out.print("Escolha a direção em que o Robô andará:");
                        direcao = sc.next();
                        direcao = direcao.toLowerCase();
                        if (direcao.equals("e") || direcao.equals("t") || direcao.equals("d")) {
                            System.out.println("Caminho errado, volte do começo e tente outra direção!");
                            return;
                        } else {
                            System.out.print("Digite o valor do quarto movimento:");
                            valorp4 = sc.nextInt();
                            if (direcao.equals("f") && !(valorp4 == 6)) {
                                System.out.println("Valor errado! Jogue novamente.");
                                return;

                            }



                            System.out.println("  " );
                            System.out.println("(D)ireita");
                            System.out.println("(E)squerda");
                            System.out.println("(F)rente");
                            System.out.println("(T)rás");
                            System.out.print("Escolha a direção em que o Robô andará:");
                            direcao = sc.next();
                            direcao = direcao.toLowerCase();
                            if (direcao.equals("t") || direcao.equals("f") || direcao.equals("d")) {
                                System.out.println("Caminho errado, volte do começo e tente outra direção!");
                                return;
                            } else {
                                System.out.print("Digite o valor do quinto movimento:");
                                valorp5 = sc.nextInt();
                                if (direcao.equals("e") && !(valorp5 == 9)) {
                                    System.out.println("Valor errado! Jogue novamente.");
                                    return;

                                }
                            }
                        }
                    }


                }
            }
            System.out.println("  " );
            System.out.println("Parabéns, você chegou no final do caminho!");
        }

    }
}


