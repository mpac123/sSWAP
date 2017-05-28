var app = angular.module('Projects', []);

app.controller('myCtrl', function($scope) {
	$scope.names = ["Robot balansujacy", "Rakieta", "Aplikacja mobilna"];
	$scope.kolo = ["Koło robotyki Bionik", "Koło Latania w Kosmos", "Koło Twórców Aplikacji"]
});

app.controller('Tasks', function($scope)  {
	$scope.names=[
		{name:"Zlutowanie jakichś rzeczy",termin:"do 13 czerwca", kategoria:"Elektronika"},
		{name:"Obsluga Solidworksa", termin: "na juz", kategotia: "CAD"},
		{name:"Programowanie mikrokontrolerow", termin: "do 31 maja", kategoria: "Programowanie"},
	]
});

app.controller('Projs', function($scope)  {
	$scope.names=[
		{name:"Portal do podróży w czasoprzestrzeni",kolo:"Koło Naukowe Czasoprzestrzeni", status:"nowe"},
		{name:"Projekt rakiety do polecenia w Kosmos", kolo: "Kolo Naukowe Latania w Kosmos", status: "w realizacji"},
		{name:"Grupa robotów balansujących", kolo: "Koło Naukowe Robotyki BIONIK", status: "w realizacji"},
		{name:"Modelowanie kałasznikowa w Solidworksie", kolo: "Kolo Fanatyków Rysunku Technicznego", status: "zakończone"},
	]
});
