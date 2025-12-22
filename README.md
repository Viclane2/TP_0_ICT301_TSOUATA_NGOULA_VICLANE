# TP ICT301 - Principes SOLID

**Nom : TSOUATA NGOULA
**Prénom : VICLANE
**Matricule : 23U2390

## Compréhension des principes SOLID

SOLID est un ensemble de 5 principes de conception logicielle qui visent à produire un code plus maintenable, évolutif et robuste.

**SRP (Single Responsibility)** : Une classe doit avoir une seule responsabilité. Cela réduit les impacts des changements.

**OCP (Open/Closed)** : Le code doit être ouvert aux extensions mais fermé aux modifications. On ajoute des fonctionnalités sans toucher au code existant.

**LSP (Liskov Substitution)** : Les sous-classes doivent pouvoir remplacer leurs classes mères sans casser le programme.

**ISP (Interface Segregation)** : Mieux vaut plusieurs interfaces spécifiques qu'une seule interface générale. Évite d'imposer des méthodes inutiles.

**DIP (Dependency Inversion)** : Il faut dépendre des abstractions (interfaces) plutôt que des implémentations concrètes. Réduit le couplage.

## Structure du projet

- `SRP/` : Single Responsibility Principle
- `OCP/` : Open/Closed Principle  
- `LSP/` : Liskov Substitution Principle
- `ISP/` : Interface Segregation Principle
- `DIP/` : Dependency Inversion Principle

Chaque dossier contient :
- `avant/` : code problématique avant refactoring
- `apres/` : solution après application du principe
- `README.md` : explication spécifique au principe


