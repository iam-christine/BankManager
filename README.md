## Gestion de comptes bancaires

Ce projet Java met en pratique l’héritage en créant plusieurs types de comptes à partir d’une classe de base.

## Description
Une classe principale `BankAccount` contient les informations communes à tous les comptes.  
D’autres classes spécialisées héritent de celle-ci pour ajouter leurs propres caractéristiques.

## Classes du projet
- `BankAccount` : classe de base contenant le numéro de compte et le solde
- `CheckingAccount` : compte courant avec une limite
- `SavingsAccount` : compte épargne avec un taux d’intérêt
- `COD` : certificat de dépôt avec une durée

## Fonctionnalités
- Création de différents types de comptes
- Utilisation de l’héritage (`extends`)
- Accès aux attributs hérités
- Ajout d’attributs spécifiques selon le type de compte

## Lancer le projet
1. Compiler les fichiers :
   `javac *.java`
2. Exécuter le programme :
   `java Main`

## Objectif
Comprendre les bases de la programmation orientée objet en Java, notamment l’héritage.

## Auteure
Toure Myriam Christine Ibnat Mohamed