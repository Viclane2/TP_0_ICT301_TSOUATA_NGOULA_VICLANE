# ISP - Interface Segregation Principle

Les clients ne doivent pas être forcés de dépendre d'interfaces qu'ils n'utilisent pas.

## Problème avant
L'interface Worker avait work() et eat(). RobotWorker devait implémenter eat() alors qu'un robot ne mange pas.

## Solution après
Séparation en deux interfaces : Workable (work()) et Eatable (eat()). HumanWorker implémente les deux, RobotWorker implémente seulement Workable.