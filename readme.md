## 1
* La **JVM** est le cœur de Java.

* Elle fait fonctionner vos programmes Java, précompilés en byte code.

* Les fichiers contenant le code source de vos programmes Java ont l'extension **.java** .

* Les fichiers précompilés correspondant à vos codes source Java ont l'extension **.class** .

* Le byte code est un code intermédiaire entre celui de votre programme et celui que votre machine peut comprendre.

* Un programme Java, codé sous Windows, peut être précompilé sous Mac et enfin exécuté sous Linux.

* Votre machine NE PEUT PAS comprendre le byte code, elle a besoin de la JVM.

* Tous les programmes Java sont composés d'au moins une classe.

* Le point de départ de tout programme Java est la méthodepublic **static void main(String[] args)**.

* On peut afficher des messages dans la console grâce à ces instructions :
```java
        System.out.println() // qui affiche un message avec un saut de ligne à la fin ;

        System.out.print() //qui affiche un message sans saut de ligne.
```
* \n va insérer un caractère d'échappement
* \r va insérer un retour chariot, parfois utilisé aussi pour les retours à la ligne ;
* \t va faire une tabulation.

## 2
* Les variables sont essentielles dans la construction de programmes informatiques.

* On affecte une valeur dans une variable avec l'opérateur égal (« = »).

* Après avoir affecté une valeur à une variable, l'instruction doit se terminer par un point-virgule (« ; »).

* Vos noms de variables ne doivent contenir ni caractères accentués ni espaces et doivent, dans la mesure du possible, respecter la convention de nommage Java.

* Lorsque vous effectuez des opérations sur des variables, prenez garde à leur type : vous pourriez perdre en précision.

* Vous pouvez caster un résultat en ajoutant un type devant celui-ci :(int),(double), etc.

* Prenez garde aux priorités lorsque vous castez le résultat d'opérations, faute de quoi ce dernier risque d'être incorrect.

```java
        double st  = 0.333333333333333333333333333333333333333333334d;
        int entier = 32;
        float pi = 3.1416f;
        char carac = 'z';
        long lg = 1564602316515616L

        double nbr1 = 10, nbr2 = 3;
        double resultat = (nbr1 / nbr2) ;       //3.3333333    
        float resultat = (float)(nbr1 / nbr2);  //3.3333333333333335

        int nb1 = 3, nb2 = 2;
        double rett = (double)(nb1 / nb2);              //1
        double resultt = (double)(nb1) / (double)(nb2); //1.5

        int i = 12;
        String j = new String();
        j = j.valueOf(i);                       //transforme int en String

        int i = 12;
        String j = new String();
        j = j.valueOf(i);
        int k = Integer.valueOf(j).intValue();

```


## 3

* La lecture des entrées clavier se fait via l'objet **Scanner**.

* Ce dernier se trouve dans le package **java.util** que vous devrez importer.

* Pour pouvoir récupérer ce vous allez taper dans la console, vous devrez initialiser l'objet Scanner avec l'entrée standard, **System.in**.

* Il y a une méthode de récupération de données pour chaque type (sauf les *char*) : **nextLine()** pour les String, **nextInt()** pour les int etc...

```java
        //Ceci importe la classe Scanner du package java.util
        import java.util.Scanner;
        //Ceci importe toutes les classes du package java.util
        import java.util.*;

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double d = sc.nextDouble();
        long l = sc.nextLong();
        byte b = sc.nextByte();

        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez un entier : ");
        int i = sc.nextInt();
        System.out.println("Saisissez une chaîne : ");
        sc.nextLine();       // vide la ligne après l'instructions 
        String str = sc.nextLine();
        System.out.println("FIN ! ");
```
# 4


* Les conditions vous permettent de n'exécuter que certains morceaux de code.

* Il existe plusieurs sortes de structures conditionnelles :

* la structure if... elseif... else ;

* la structure switch... case... default ;

* la structure  ? :.

* Si un bloc d'instructions contient plus d'une ligne, vous devez l'entourer d'accolades afin de bien en délimiter le début et la fin.

* Pour pouvoir mettre une condition en place, vous devez comparer des variables à l'aide d'opérateurs logiques.

* Vous pouvez mettre autant de comparaisons renvoyant un boolean que vous le souhaitez dans une condition.

* Pour la structure switch, pensez à mettre les instructions break; si vous ne souhaitez exécuter qu'un seul bloc case.


#5* 
* Les boucles vous permettent simplement d'effectuer des tâches répétitives.

* Il existe plusieurs sortes de boucles :

* la boucle while(condition){…} évalue la condition puis exécute éventuellement un tour de boucle (ou plus) ;

* la boucle do{…}while(condition); fonctionne exactement comme la précédente, mais effectue un tour de boucle quoi qu'il arrive ;

* la boucle for permet d'initialiser un compteur, une condition et un incrément dans sa déclaration afin de répéter un morceau de code un nombre limité de fois.

* Tout comme les conditions, si une boucle contient plus d'une ligne de code à exécuter, vous devez l'entourer d'accolades afin de bien en délimiter le début et la fin.


```java
        String prenom = new String();
//Pas besoin d'initialiser : on entre au moins une fois dans la boucle !
        char reponse = ' ';

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Donnez un prénom : ");
            prenom = sc.nextLine();
            System.out.println("Bonjour " + prenom + ", comment vas-tu ?");

            do {
                System.out.println("Voulez-vous réessayer ? (O/N)");
                reponse = sc.nextLine().charAt(0);
            } while (reponse != 'O' && reponse != 'N');

        } while (reponse == 'O');

        System.out.println("Au revoir…");
```


j'aime les fruits bio
