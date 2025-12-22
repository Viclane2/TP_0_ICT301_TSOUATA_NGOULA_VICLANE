# OCP - Open/Closed Principle

Les classes doivent être ouvertes à l'extension mais fermées à la modification.

## Problème avant
AreaCalculator utilisait des if/else pour chaque type de forme. Ajouter une nouvelle forme (ex:Triangle) obligeait à modifier son code.

## Solution après
Introduction de l'interface Shape. AreaCalculator2 travaille avec Shape. Pour ajouter par examle un Triangle, on crée juste une nouvelle classe qui implémente Shape, sans toucher au calculateur.