# Formulations-sb

Here as part of the personal project in the Fullstack Java Course we ara converting the "Formulations" repository/app to Java Spring Boot. It tries to find the minimum cost solution for the animal food formulation problem with some constraints.

For the moment we populate the initial data in the H2 database.

We execute the app and we can use some Rest controllers to view the data and also to execute the Solver to find the minimum cost solution:

http://localhost:8080/api/ingredients

[{"id":1,"description":"Arros","unit":{"id":1,"description":"g"},"cost":3.0},{"id":2,"description":"Blat","unit":{"id":1,"description":"g"},"cost":2.0},{"id":3,"description":"Pollastre","unit":{"id":1,"description":"g"},"cost":5.0}]

http://localhost:8080/api/formulationingredients

...

http://localhost:8080/api/compositions

...

http://localhost:8080/api/constraints

[{"formulation":{"description":"Primera Formulació de prova"},"component":{"id":1,"description":"Grasses","unit":{"id":1,"description":"g"}},"cantMin":0.3,"cantMax":0.5},{"formulation":{"description":"Primera Formulació de prova"},"component":{"id":2,"description":"Proteines","unit":{"id":1,"description":"g"}},"cantMin":0.4,"cantMax":0.6},{"formulation":{"description":"Primera Formulació de prova"},"component":{"id":3,"description":"Fibra","unit":{"id":1,"description":"g"}},"cantMin":0.05,"cantMax":0.15}]

http://localhost:8080/api/components

[{"id":1,"description":"Grasses","unit":{"id":1,"description":"g"}},{"id":2,"description":"Proteines","unit":{"id":1,"description":"g"}},{"id":3,"description":"Fibra","unit":{"id":1,"description":"g"}},{"id":4,"description":"Hidrats de carboni","unit":{"id":1,"description":"g"}},{"id":5,"description":"Calories","unit":null}]

http://localhost:8080/api/formulations

[{"description":"Primera Formulació de prova"},{"description":"Segona Formulació de prova"},{"description":"Tercera Formulació de prova"}]

Finally we have to call to the Solver API to solve the problem:

http://localhost:8080/api/solver/1

And after we can call the solutioins API to get the results:

http://localhost:8080/api/solutions

[{"id":1,"cost":5.0,"formulation":{"description":"Primera Formulació de prova"}},{"id":2,"cost":4.7,"formulation":{"description":"Primera Formulació de prova"}},{"id":3,"cost":4.749999999999999,"formulation":{"description":"Primera Formulació de prova"}}]

http://localhost:8080/api/solutionsingredients

[{"solution":{"id":1,"cost":5.0,"formulation":{"description":"Primera Formulació de prova"}},"ingredient":{"id":1,"description":"Arros","unit":{"id":1,"description":"g"},"cost":3.0},"quantity":0.0},{"solution":{"id":1,"cost":5.0,"formulation":{"description":"Primera Formulació de prova"}},"ingredient":{"id":2,"description":"Blat","unit":{"id":1,"description":"g"},"cost":2.0},"quantity":0.0},{"solution":{"id":1,"cost":5.0,"formulation":{"description":"Primera Formulació de prova"}},"ingredient":{"id":3,"description":"Pollastre","unit":{"id":1,"description":"g"},"cost":5.0},"quantity":1.0},{"solution":{"id":2,"cost":4.7,"formulation":{"description":"Primera Formulació de prova"}},"ingredient":{"id":1,"description":"Arros","unit":{"id":1,"description":"g"},"cost":3.0},"quantity":0.0},{"solution":{"id":2,"cost":4.7,"formulation":{"description":"Primera Formulació de prova"}},"ingredient":{"id":2,"description":"Blat","unit":{"id":1,"description":"g"},"cost":2.0},"quantity":0.10000000000000009},{"solution":{"id":2,"cost":4.7,"formulation":{"description":"Primera Formulació de prova"}},"ingredient":{"id":3,"description":"Pollastre","unit":{"id":1,"description":"g"},"cost":5.0},"quantity":0.8999999999999999},{"solution":{"id":3,"cost":4.749999999999999,"formulation":{"description":"Primera Formulació de prova"}},"ingredient":{"id":1,"description":"Arros","unit":{"id":1,"description":"g"},"cost":3.0},"quantity":0.1250000000000001},{"solution":{"id":3,"cost":4.749999999999999,"formulation":{"description":"Primera Formulació de prova"}},"ingredient":{"id":2,"description":"Blat","unit":{"id":1,"description":"g"},"cost":2.0},"quantity":0.0},{"solution":{"id":3,"cost":4.749999999999999,"formulation":{"description":"Primera Formulació de prova"}},"ingredient":{"id":3,"description":"Pollastre","unit":{"id":1,"description":"g"},"cost":5.0},"quantity":0.8749999999999999}]

