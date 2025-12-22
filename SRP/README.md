# SRP - Single Responsibility Principle

Une classe doit avoir une seule responsabilité, c'est-à-dire une seule raison de changer.

## Problème avant
La classe Book faisait tout : gestion données, affichage, sauvegarde, logique métier. Une modification sur un point risquait de tout casser.

## Solution après
Séparation en 4 classes : BookSRP (données), BookPrinter (affichage), BookSaver (sauvegarde), BookBusinessLogic (métier). Chaque classe a un rôle unique.