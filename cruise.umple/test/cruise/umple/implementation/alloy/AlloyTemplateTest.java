package cruise.umple.implementation.alloy;

import java.io.File;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import cruise.umple.implementation.TemplateTest;
import cruise.umple.util.SampleFileWriter;

public class AlloyTemplateTest extends TemplateTest{
	  @Before
	  public void setUp()
	  {
	    super.setUp();
	    language = "Alloy";
	    languagePath = "alloy";
	  }
	  
	  @After
	  public void tearDown()
	  {
	    super.tearDown();
	    SampleFileWriter.destroy(pathToInput + "/alloy/Alloy_AssociationOneToOne.als");
	    SampleFileWriter.destroy(pathToInput + "/alloy/Alloy_AssociationOneToMany.als");
	    
	    SampleFileWriter.destroy(pathToInput + "/alloy/Alloy_Associations.als");
	    SampleFileWriter.destroy(pathToInput + "/alloy/AlloySophisticatedAssociations.als");
	    SampleFileWriter.destroy(pathToInput + "/alloy/AlloyAssociation.als");
	    SampleFileWriter.destroy(pathToInput + "/alloy/AlloyAssociations.als");
	    SampleFileWriter.destroy(pathToInput + "/alloy/UmpleClass.als");
	    SampleFileWriter.destroy(pathToInput + "/alloy/AssociationWithNumericBounds.als");
	    //SampleFileWriter.destroy(pathToInput + "/alloy/AssociationWithNumericBound.als");
	  }

	  @Test //@Ignore
	  public void AlloyAssociations()
	  {
		  assertUmpleTemplateFor("alloy/AlloyAssociations.ump","alloy/AlloyAssociations.alloy.txt");
		  Assert.assertEquals(true, (new File(pathToInput + "/alloy/AlloyAssociations.als")).exists());
	  }
	  
	  @Test //@Ignore
	  public void AlloySophisticatedAssociations()
	  {
		  assertUmpleTemplateFor("alloy/AlloySophisticatedAssociations.ump","alloy/AlloySophisticatedAssociations.alloy.txt");
		  Assert.assertEquals(true, (new File(pathToInput + "/alloy/AlloySophisticatedAssociations.als")).exists());
	  }
	  
	  @Test //@Ignore
	  public void oneToOneAssociation()
	  {
		  assertUmpleTemplateFor("alloy/Alloy_AssociationOneToOne.ump","alloy/AlloyAssociationOneToOne.alloy.txt");
		  Assert.assertEquals(true, (new File(pathToInput + "/alloy/Alloy_AssociationOneToOne.als")).exists());
	  }
	  
	  @Test //@Ignore
	  public void oneToManyAssociation()
	  {
		  assertUmpleTemplateFor("alloy/Alloy_AssociationOneToMany.ump","alloy/AlloyAssociationOneToMany.alloy.txt");
		  Assert.assertEquals(true, (new File(pathToInput + "/alloy/Alloy_AssociationOneToMany.als")).exists());
	  }
	  
	  @Test //@Ignore
	  public void Association()
	  {
		  assertUmpleTemplateFor("alloy/AlloyAssociation.ump","alloy/AlloyAssociation.alloy.txt");
		  Assert.assertEquals(true, (new File(pathToInput + "/alloy/AlloyAssociation.als")).exists());
	  }
	  
	  @Test //@Ignore
	  public void UmpleClass()
	  {
		  assertUmpleTemplateFor("alloy/UmpleClass.ump","alloy/UmpleClass.alloy.txt");
		  Assert.assertEquals(true, (new File(pathToInput + "/alloy/UmpleClass.als")).exists());
	  }
	  
	  @Test //@Ignore
	  public void AssociationWithNumericBounds()
	  {
		  assertUmpleTemplateFor("alloy/AssociationWithNumericBounds.ump","alloy/AssociationWithNumericBounds.alloy.txt");
		  Assert.assertEquals(true, (new File(pathToInput + "/alloy/AssociationWithNumericBounds.als")).exists());
	  }
}
