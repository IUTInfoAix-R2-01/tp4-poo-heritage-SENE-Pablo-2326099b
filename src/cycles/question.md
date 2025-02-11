Q5 : Que signifie “redéfinir une méthode” ?

Une redéfinition de méthode est le fait de modifier une méthode deja existante héritée d'une classe mére avec @override.


Q6 : Quelles méthodes de Velo et VeloElec sont redéfinies ?
Il y a les fonctions toString() et getPuissance().

Q7 : Que signifie l’annotation @Override, placée parfois avant la définition d’une méthode ?
Elle permet de redéfinir une fonctions deja existante.

Q8 : De manière générale, lorsque l’annotation @Override est pertinente dans le code, qu’apporte sa pré-
sence ? Dans ce cas, peut-on s’en dispenser ? Tester.

Elle permet d'indiquer au compilateur que la méthode sous-jacente est redéfinie.
Empéche les erreurs de frappe.
On peut s'en passer, mais par convention et pour un code de qualité sont utilisation est extremement recommandés.

Q10 : Que signifie l’appel super.getPuissane(FrequenceCoupsDePedale) dans la méthode
VeloElec.getPuissane() ?

super permet d'acceder à la méthode de la classe parente Vélo afin de l'utiliser dans VéloElec.