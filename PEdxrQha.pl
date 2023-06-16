%Relações entre pais e filhos.
progenitor(maria, jose).
progenitor(joao, jose).
progenitor(joao, ana).
progenitor(jose, julia).
progenitor(jose, iris).
progenitor(iris, jorge).

%Relações entre avós e netos
avo(X, Z) :- progenitor(X, Y),progenitor(Y, Z).








