# LSP - Liskov Substitution Principle

Les objets d'une sous-classe doivent pouvoir remplacer ceux de la classe mère sans affecter le programme.

## Problème avant
Square héritait de Rectangle. Mais setWidth() sur un Square changeait aussi la hauteur, violant le comportement attendu d'un Rectangle.

## Solution après
Square et Rectangle implémentent l'interface Shape. Chaque classe a son propre comportement cohérent. On peut les substituer via l'interface Shape.