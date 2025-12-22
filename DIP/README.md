# DIP - Dependency Inversion Principle

Dépendre des abstractions, pas des implémentations concrètes.

## Problème avant
OrderProcessor dépendait directement de MySQLDatabase. Changer de base de données nécessitait de modifier OrderProcessor.

## Solution après
Introduction de l'interface Database. OrderProcessor dépend de Database. On peut injecter MySQLDatabase ou MongoDBDatabase sans changer OrderProcessor.