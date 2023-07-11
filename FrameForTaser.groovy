// code here 
double inch=25.4
import eu.mihosoft.vrl.v3d.Cylinder
double cylinderRadius = 3/4*inch
double cylinderHeight = 5/2*inch 
double innerRadius = 4/7*inch 
CSG OutCylinder = new Cylinder(cylinderRadius,cylinderHeight,(int)100).toCSG()
CSG inCylinder = new Cylinder (innerRadius,cylinderHeight).toCSG()
CSG Cylinder = OutCylinder.difference(inCylinder);


return[Cylinder]