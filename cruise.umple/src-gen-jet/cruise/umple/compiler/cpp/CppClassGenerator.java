package cruise.umple.compiler.cpp;

import cruise.umple.compiler.*;
import cruise.umple.util.*;
import java.util.*;

@SuppressWarnings("unused")
public class CppClassGenerator implements ILang 
{

  protected static String nl;
  public static synchronized CppClassGenerator create(String lineSeparator)
  {
    nl = lineSeparator;
    CppClassGenerator result = new CppClassGenerator();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "/* EXPERIMENTAL CODE - NON COMPILEABLE VERSION OF C++ */" + NL + "/*PLEASE DO NOT EDIT THIS CODE*/" + NL + "/*This code was generated using the UMPLE 1.15.0.1751 modeling language!*/";
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL + "\t";
  protected final String TEXT_5 = "int i;";
  protected final String TEXT_6 = NL + "  //------------------------" + NL + "  // CONSTRUCTOR" + NL + "  //------------------------" + NL + "  ";
  protected final String TEXT_7 = NL + "\t\tfor (";
  protected final String TEXT_8 = "i=0; i<";
  protected final String TEXT_9 = ".size(); i++)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_10 = "[i] = NULL;" + NL + "\t}";
  protected final String TEXT_11 = NL + "    ";
  protected final String TEXT_12 = "();";
  protected final String TEXT_13 = NL + "    ";
  protected final String TEXT_14 = " = true;";
  protected final String TEXT_15 = NL + "    ";
  protected final String TEXT_16 = " = ";
  protected final String TEXT_17 = ";";
  protected final String TEXT_18 = NL + "    ";
  protected final String TEXT_19 = " = false;";
  protected final String TEXT_20 = NL + "    ";
  protected final String TEXT_21 = " = ";
  protected final String TEXT_22 = ";";
  protected final String TEXT_23 = NL + "    ";
  protected final String TEXT_24 = " = ";
  protected final String TEXT_25 = ";";
  protected final String TEXT_26 = NL + "    ";
  protected final String TEXT_27 = " = ";
  protected final String TEXT_28 = "++;";
  protected final String TEXT_29 = NL + "    if (!";
  protected final String TEXT_30 = "(";
  protected final String TEXT_31 = "))" + NL + "    {" + NL + "      throw (\"Unable to create ";
  protected final String TEXT_32 = " due to ";
  protected final String TEXT_33 = "\");" + NL + "    }";
  protected final String TEXT_34 = NL + "    for (i=0; i<";
  protected final String TEXT_35 = ".size(); i++)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_36 = "[i] = NULL;" + NL + "\t}" + NL + "    bool ";
  protected final String TEXT_37 = " = ";
  protected final String TEXT_38 = "(";
  protected final String TEXT_39 = ");" + NL + "    try {" + NL + "\t\t throw  ";
  protected final String TEXT_40 = ";" + NL + "\t\t}" + NL + "\tcatch (exception& e)\t" + NL + "\t{" + NL + "\tcout<<\"Unable to create ";
  protected final String TEXT_41 = ", must have ";
  protected final String TEXT_42 = " ";
  protected final String TEXT_43 = "\";" + NL + "\t}";
  protected final String TEXT_44 = NL + "    for (i=0; i<";
  protected final String TEXT_45 = ".size(); i++)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_46 = "[i] = NULL;" + NL + "\t}" + NL + "    bool ";
  protected final String TEXT_47 = " = ";
  protected final String TEXT_48 = "(";
  protected final String TEXT_49 = ");" + NL + "    if (!";
  protected final String TEXT_50 = ")" + NL + "    {" + NL + "    \ttry" + NL + "    \t{    \t" + NL + "      \t  cout<<\"Unable to create ";
  protected final String TEXT_51 = ", must have ";
  protected final String TEXT_52 = " or fewer ";
  protected final String TEXT_53 = ", no duplicates.\";" + NL + "      \t}" + NL + "      \t" + NL + "      \tcatch" + NL + "      \t{" + NL + "      \t\tcerr<<\"exception caught:\"<<e.what()<<endl;" + NL + "      \t}" + NL + "    }";
  protected final String TEXT_54 = NL + "    for (i=0; i<";
  protected final String TEXT_55 = ".size(); i++)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_56 = "[i] = NULL;" + NL + "\t}" + NL + "    bool ";
  protected final String TEXT_57 = " = ";
  protected final String TEXT_58 = "(";
  protected final String TEXT_59 = ");" + NL + "    if (!";
  protected final String TEXT_60 = ")" + NL + "    {" + NL + "    " + NL + "    try" + NL + "    \t{    \t" + NL + "      \t  cout<<\"Unable to create ";
  protected final String TEXT_61 = ", must not have duplicate ";
  protected final String TEXT_62 = ".\");" + NL + "      \t}" + NL + "      \t" + NL + "      \tcatch" + NL + "      \t{" + NL + "      \t\tcerr<<\"exception caught:\"<<e.what()<<endl;" + NL + "      \t}" + NL + "    }";
  protected final String TEXT_63 = NL + "    for (i=0; i<";
  protected final String TEXT_64 = ".size(); i++)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_65 = "[i] = NULL;" + NL + "\t}";
  protected final String TEXT_66 = NL + "    if (";
  protected final String TEXT_67 = " == NULL || ";
  protected final String TEXT_68 = "->";
  protected final String TEXT_69 = "() != NULL)" + NL + "    {" + NL + "      throw new RuntimeException(\"Unable to create ";
  protected final String TEXT_70 = " due to ";
  protected final String TEXT_71 = "\");" + NL + "    }";
  protected final String TEXT_72 = NL + "    ";
  protected final String TEXT_73 = " = ";
  protected final String TEXT_74 = ";";
  protected final String TEXT_75 = NL + "    for (i=0; i<";
  protected final String TEXT_76 = ".size(); i++)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_77 = "[i] = NULL;" + NL + "\t}";
  protected final String TEXT_78 = NL + "    bool ";
  protected final String TEXT_79 = " = ";
  protected final String TEXT_80 = "(";
  protected final String TEXT_81 = ");" + NL + "    if (!";
  protected final String TEXT_82 = ")" + NL + "    {" + NL + "      throw new RuntimeException(\"Unable to create ";
  protected final String TEXT_83 = " due to ";
  protected final String TEXT_84 = "\");" + NL + "    }";
  protected final String TEXT_85 = NL + "    for (i=0; i<";
  protected final String TEXT_86 = ".size(); i++)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_87 = "[i] = NULL;" + NL + "\t}";
  protected final String TEXT_88 = NL + "    for (i=0; i<";
  protected final String TEXT_89 = ".size(); i++)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_90 = "[i] = NULL;" + NL + "\t}" + NL + "    bool ";
  protected final String TEXT_91 = " = ";
  protected final String TEXT_92 = "(";
  protected final String TEXT_93 = ");" + NL + "    try {" + NL + "\t\t throw  ";
  protected final String TEXT_94 = ";" + NL + "\t\t}" + NL + "\tcatch (exception& e)\t" + NL + "\t{" + NL + "\tcout<<\"Unable to create ";
  protected final String TEXT_95 = ", must have ";
  protected final String TEXT_96 = " ";
  protected final String TEXT_97 = "\";" + NL + "\t}";
  protected final String TEXT_98 = "for (i=0; i<";
  protected final String TEXT_99 = ".size(); i++)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_100 = "[i] = NULL;" + NL + "\t};";
  protected final String TEXT_101 = NL + "    ";
  protected final String TEXT_102 = ".push_back(";
  protected final String TEXT_103 = ");";
  protected final String TEXT_104 = NL + "    if (";
  protected final String TEXT_105 = " == NULL) { ";
  protected final String TEXT_106 = "(";
  protected final String TEXT_107 = ".";
  protected final String TEXT_108 = "); }";
  protected final String TEXT_109 = NL + "    ";
  protected final String TEXT_110 = "(";
  protected final String TEXT_111 = ".";
  protected final String TEXT_112 = ");";
  protected final String TEXT_113 = NL + "  ";
  protected final String TEXT_114 = "* ";
  protected final String TEXT_115 = "::getInstance()" + NL + "  {" + NL + "    if(!theInstance)" + NL + "    {" + NL + "      theInstance = new ";
  protected final String TEXT_116 = ";" + NL + "    }" + NL + "    return theInstance;" + NL + "  }";
  protected final String TEXT_117 = NL;
  protected final String TEXT_118 = NL + "  ";
  protected final String TEXT_119 = "::";
  protected final String TEXT_120 = "(";
  protected final String TEXT_121 = ")" + NL + "  {";
  protected final String TEXT_122 = NL + "\t\tfor (";
  protected final String TEXT_123 = "i=0; i<";
  protected final String TEXT_124 = ".size(); i++)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_125 = "[i] = NULL;" + NL + "\t}";
  protected final String TEXT_126 = NL + "    ";
  protected final String TEXT_127 = "();";
  protected final String TEXT_128 = NL + "    ";
  protected final String TEXT_129 = " = ";
  protected final String TEXT_130 = ";";
  protected final String TEXT_131 = NL + "    ";
  protected final String TEXT_132 = " = ";
  protected final String TEXT_133 = "++;";
  protected final String TEXT_134 = NL + "    ";
  protected final String TEXT_135 = NL + "    for (i=0; i<";
  protected final String TEXT_136 = ".size(); i++)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_137 = "[i] = NULL;" + NL + "\t}";
  protected final String TEXT_138 = NL + "    bool ";
  protected final String TEXT_139 = " = ";
  protected final String TEXT_140 = "(";
  protected final String TEXT_141 = ");" + NL + "    if (!";
  protected final String TEXT_142 = ")" + NL + "    {" + NL + "      throw new RuntimeException(\"Unable to create ";
  protected final String TEXT_143 = " due to ";
  protected final String TEXT_144 = "\");" + NL + "    }";
  protected final String TEXT_145 = NL + "    for (i=0; i<";
  protected final String TEXT_146 = ".size(); i++)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_147 = "[i] = NULL;" + NL + "\t}";
  protected final String TEXT_148 = NL + "    for (i=0; i<";
  protected final String TEXT_149 = ".size(); i++)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_150 = "[i] = NULL;" + NL + "\t}" + NL + "    bool ";
  protected final String TEXT_151 = " = ";
  protected final String TEXT_152 = "(";
  protected final String TEXT_153 = ");" + NL + "    try {" + NL + "\t\t throw  ";
  protected final String TEXT_154 = ";" + NL + "\t\t}" + NL + "\tcatch (exception& e)\t" + NL + "\t{" + NL + "\tcout<<\"Unable to create ";
  protected final String TEXT_155 = ", must have ";
  protected final String TEXT_156 = " ";
  protected final String TEXT_157 = "\";" + NL + "\t}";
  protected final String TEXT_158 = "for (i=0; i<";
  protected final String TEXT_159 = ".size(); i++)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_160 = "[i] = NULL;" + NL + "\t};";
  protected final String TEXT_161 = NL + "    ";
  protected final String TEXT_162 = ".push_back(";
  protected final String TEXT_163 = ");";
  protected final String TEXT_164 = NL + "  ";
  protected final String TEXT_165 = NL + "  \t";
  protected final String TEXT_166 = NL + NL + "  //------------------------" + NL + "  // INTERFACE" + NL + "  //------------------------" + NL;
  protected final String TEXT_167 = NL + "  bool ";
  protected final String TEXT_168 = "::";
  protected final String TEXT_169 = "(const ";
  protected final String TEXT_170 = " & ";
  protected final String TEXT_171 = ")" + NL + "  {" + NL + "    bool wasSet = false;";
  protected final String TEXT_172 = NL + "    ";
  protected final String TEXT_173 = " = false;";
  protected final String TEXT_174 = NL + "    ";
  protected final String TEXT_175 = " = ";
  protected final String TEXT_176 = ";" + NL + "    wasSet = true;";
  protected final String TEXT_177 = NL + "    return wasSet;" + NL + "  }" + NL;
  protected final String TEXT_178 = NL + "  bool ";
  protected final String TEXT_179 = "::";
  protected final String TEXT_180 = "(const ";
  protected final String TEXT_181 = " & ";
  protected final String TEXT_182 = ")" + NL + "  {" + NL + "    bool wasSet = false;";
  protected final String TEXT_183 = NL + "    ";
  protected final String TEXT_184 = " = ";
  protected final String TEXT_185 = ";" + NL + "    wasSet = true;";
  protected final String TEXT_186 = NL + "    return wasSet;" + NL + "  }" + NL + "" + NL + "  bool ";
  protected final String TEXT_187 = "::";
  protected final String TEXT_188 = "()" + NL + "  {" + NL + "    bool wasReset = false;";
  protected final String TEXT_189 = NL + "    ";
  protected final String TEXT_190 = " = ";
  protected final String TEXT_191 = "();" + NL + "    wasReset = true;";
  protected final String TEXT_192 = NL + "    return wasReset;" + NL + "  }" + NL;
  protected final String TEXT_193 = NL + "  bool ";
  protected final String TEXT_194 = "::";
  protected final String TEXT_195 = "(const ";
  protected final String TEXT_196 = " & ";
  protected final String TEXT_197 = ")" + NL + "  {" + NL + "    bool wasAdded = false;";
  protected final String TEXT_198 = NL + "    wasAdded = ";
  protected final String TEXT_199 = ".add(";
  protected final String TEXT_200 = ");";
  protected final String TEXT_201 = NL + "    return wasAdded;" + NL + "  }" + NL + "" + NL + "  bool ";
  protected final String TEXT_202 = "::";
  protected final String TEXT_203 = "(";
  protected final String TEXT_204 = " & ";
  protected final String TEXT_205 = ")" + NL + "  {" + NL + "    bool wasRemoved = false;";
  protected final String TEXT_206 = NL + "    wasRemoved = ";
  protected final String TEXT_207 = ".remove(";
  protected final String TEXT_208 = ");";
  protected final String TEXT_209 = NL + "    return wasRemoved;" + NL + "  }" + NL;
  protected final String TEXT_210 = NL + "  bool ";
  protected final String TEXT_211 = "::";
  protected final String TEXT_212 = "(const ";
  protected final String TEXT_213 = " & ";
  protected final String TEXT_214 = ")" + NL + "  {" + NL + "    bool wasSet = false;";
  protected final String TEXT_215 = NL + "    ";
  protected final String TEXT_216 = " = ";
  protected final String TEXT_217 = ";" + NL + "    wasSet = true;";
  protected final String TEXT_218 = NL + "    return wasSet;" + NL + "  }" + NL;
  protected final String TEXT_219 = NL + "  ";
  protected final String TEXT_220 = " ";
  protected final String TEXT_221 = "::";
  protected final String TEXT_222 = "(int index)" + NL + "  {";
  protected final String TEXT_223 = NL + "    ";
  protected final String TEXT_224 = " ";
  protected final String TEXT_225 = " = ";
  protected final String TEXT_226 = ".get(index);";
  protected final String TEXT_227 = NL + "    return ";
  protected final String TEXT_228 = ";" + NL + "  }" + NL;
  protected final String TEXT_229 = NL + "  ";
  protected final String TEXT_230 = "[] ";
  protected final String TEXT_231 = "::";
  protected final String TEXT_232 = "()" + NL + "  {";
  protected final String TEXT_233 = NL + "    ";
  protected final String TEXT_234 = "[] ";
  protected final String TEXT_235 = " = ";
  protected final String TEXT_236 = ".toArray(new ";
  protected final String TEXT_237 = "[";
  protected final String TEXT_238 = ".size()]);";
  protected final String TEXT_239 = NL + "    return ";
  protected final String TEXT_240 = ";" + NL + "  }" + NL + "" + NL + "  int ";
  protected final String TEXT_241 = "::";
  protected final String TEXT_242 = "()" + NL + "  {";
  protected final String TEXT_243 = NL + "    int number = ";
  protected final String TEXT_244 = ".size();";
  protected final String TEXT_245 = NL + "    return number;" + NL + "  }" + NL + "" + NL + "  bool ";
  protected final String TEXT_246 = "::";
  protected final String TEXT_247 = "()" + NL + "  {";
  protected final String TEXT_248 = NL + "    bool has = ";
  protected final String TEXT_249 = ".size() > 0;";
  protected final String TEXT_250 = NL + "    return has;" + NL + "  }" + NL + "" + NL + "  int ";
  protected final String TEXT_251 = "::";
  protected final String TEXT_252 = "(";
  protected final String TEXT_253 = "* ";
  protected final String TEXT_254 = ")" + NL + "  {";
  protected final String TEXT_255 = NL + "    int index = find(";
  protected final String TEXT_256 = ".begin(), ";
  protected final String TEXT_257 = ".end(), ";
  protected final String TEXT_258 = ") - ";
  protected final String TEXT_259 = ".begin();";
  protected final String TEXT_260 = NL + "    return index;" + NL + "  }" + NL;
  protected final String TEXT_261 = NL + "  ";
  protected final String TEXT_262 = " ";
  protected final String TEXT_263 = "::";
  protected final String TEXT_264 = "()" + NL + "  {";
  protected final String TEXT_265 = NL + "    ";
  protected final String TEXT_266 = " ";
  protected final String TEXT_267 = " = ";
  protected final String TEXT_268 = ";";
  protected final String TEXT_269 = NL + "    return ";
  protected final String TEXT_270 = ";" + NL + "  }";
  protected final String TEXT_271 = NL + "  ";
  protected final String TEXT_272 = " ";
  protected final String TEXT_273 = "::";
  protected final String TEXT_274 = "()" + NL + "  {" + NL + "    return ";
  protected final String TEXT_275 = ";" + NL + "  }";
  protected final String TEXT_276 = NL + "  ";
  protected final String TEXT_277 = " ";
  protected final String TEXT_278 = "::";
  protected final String TEXT_279 = "()" + NL + "  {";
  protected final String TEXT_280 = NL + "    ";
  protected final String TEXT_281 = " ";
  protected final String TEXT_282 = " = ";
  protected final String TEXT_283 = ";";
  protected final String TEXT_284 = NL + "    return ";
  protected final String TEXT_285 = ";" + NL + "  }";
  protected final String TEXT_286 = NL + "  ";
  protected final String TEXT_287 = " ";
  protected final String TEXT_288 = "::";
  protected final String TEXT_289 = "() const" + NL + "  {";
  protected final String TEXT_290 = NL + "    return ";
  protected final String TEXT_291 = ";" + NL + "  }";
  protected final String TEXT_292 = NL + "  ";
  protected final String TEXT_293 = " ";
  protected final String TEXT_294 = "::";
  protected final String TEXT_295 = "()" + NL + "  {";
  protected final String TEXT_296 = NL + "    ";
  protected final String TEXT_297 = " ";
  protected final String TEXT_298 = " = ";
  protected final String TEXT_299 = ";";
  protected final String TEXT_300 = NL + "    return ";
  protected final String TEXT_301 = ";" + NL + "  }";
  protected final String TEXT_302 = NL + "  ";
  protected final String TEXT_303 = " ";
  protected final String TEXT_304 = "::";
  protected final String TEXT_305 = "() const" + NL + "  {";
  protected final String TEXT_306 = NL + "    return ";
  protected final String TEXT_307 = ";" + NL + "  }" + NL;
  protected final String TEXT_308 = NL + "  ";
  protected final String TEXT_309 = " ";
  protected final String TEXT_310 = "::";
  protected final String TEXT_311 = "()" + NL + "  {";
  protected final String TEXT_312 = NL + "    ";
  protected final String TEXT_313 = " ";
  protected final String TEXT_314 = " = ";
  protected final String TEXT_315 = ";";
  protected final String TEXT_316 = NL + "    return ";
  protected final String TEXT_317 = ";" + NL + "  }";
  protected final String TEXT_318 = NL + "  ";
  protected final String TEXT_319 = " ";
  protected final String TEXT_320 = "::";
  protected final String TEXT_321 = "() const" + NL + "  {";
  protected final String TEXT_322 = NL + "    return ";
  protected final String TEXT_323 = ";" + NL + "  }";
  protected final String TEXT_324 = NL + "  ";
  protected final String TEXT_325 = " ";
  protected final String TEXT_326 = "::";
  protected final String TEXT_327 = "()" + NL + "  {" + NL + "    String answer = ";
  protected final String TEXT_328 = ".toString();";
  protected final String TEXT_329 = NL + "    return answer;" + NL + "  }" + NL;
  protected final String TEXT_330 = NL + "  ";
  protected final String TEXT_331 = " ";
  protected final String TEXT_332 = "::";
  protected final String TEXT_333 = "()" + NL + "  {" + NL + "    return ";
  protected final String TEXT_334 = ";" + NL + "  }" + NL;
  protected final String TEXT_335 = NL + "  ";
  protected final String TEXT_336 = "bool ";
  protected final String TEXT_337 = "::";
  protected final String TEXT_338 = "()" + NL + "  {" + NL + "    boolean wasEventProcessed = false;" + NL;
  protected final String TEXT_339 = NL + "    ";
  protected final String TEXT_340 = NL + NL + "    return wasEventProcessed;" + NL + "  }" + NL;
  protected final String TEXT_341 = NL + "  bool ";
  protected final String TEXT_342 = "::";
  protected final String TEXT_343 = "(";
  protected final String TEXT_344 = " ";
  protected final String TEXT_345 = ")" + NL + "  {";
  protected final String TEXT_346 = NL + "    ";
  protected final String TEXT_347 = " = ";
  protected final String TEXT_348 = ";" + NL + "    return true;" + NL + "  }" + NL;
  protected final String TEXT_349 = NL + "  private void ";
  protected final String TEXT_350 = "::";
  protected final String TEXT_351 = "()" + NL + "  {" + NL + "    switch(";
  protected final String TEXT_352 = ")" + NL + "    {";
  protected final String TEXT_353 = NL + "      ";
  protected final String TEXT_354 = NL + "    }" + NL + "  }" + NL;
  protected final String TEXT_355 = NL + "  private void ";
  protected final String TEXT_356 = "::";
  protected final String TEXT_357 = "(";
  protected final String TEXT_358 = " ";
  protected final String TEXT_359 = ")" + NL + "  {";
  protected final String TEXT_360 = NL + "    ";
  protected final String TEXT_361 = " = ";
  protected final String TEXT_362 = ";";
  protected final String TEXT_363 = NL + "    if (";
  protected final String TEXT_364 = " != ";
  protected final String TEXT_365 = ".";
  protected final String TEXT_366 = " && ";
  protected final String TEXT_367 = " != ";
  protected final String TEXT_368 = ".";
  protected final String TEXT_369 = ") { ";
  protected final String TEXT_370 = "(";
  protected final String TEXT_371 = ".";
  protected final String TEXT_372 = "); }";
  protected final String TEXT_373 = NL + NL + "    // entry actions and do activities" + NL + "    switch(";
  protected final String TEXT_374 = ")" + NL + "    {";
  protected final String TEXT_375 = NL + "      ";
  protected final String TEXT_376 = NL + "    }";
  protected final String TEXT_377 = NL + "  }" + NL;
  protected final String TEXT_378 = NL + "  ";
  protected final String TEXT_379 = "* ";
  protected final String TEXT_380 = "::";
  protected final String TEXT_381 = "() " + NL + "  {";
  protected final String TEXT_382 = NL + "    return ";
  protected final String TEXT_383 = ";";
  protected final String TEXT_384 = NL + "    ";
  protected final String TEXT_385 = "* ";
  protected final String TEXT_386 = " = ";
  protected final String TEXT_387 = ";";
  protected final String TEXT_388 = NL + "    return ";
  protected final String TEXT_389 = ";";
  protected final String TEXT_390 = NL + "  }" + NL;
  protected final String TEXT_391 = NL + "  ";
  protected final String TEXT_392 = "* ";
  protected final String TEXT_393 = "::";
  protected final String TEXT_394 = "(int index) " + NL + "  {";
  protected final String TEXT_395 = NL + "    ";
  protected final String TEXT_396 = "* ";
  protected final String TEXT_397 = " = ";
  protected final String TEXT_398 = "[index];";
  protected final String TEXT_399 = NL + "    return ";
  protected final String TEXT_400 = ";" + NL + "  }" + NL + "" + NL + "  vector<";
  protected final String TEXT_401 = "*> ";
  protected final String TEXT_402 = "::";
  protected final String TEXT_403 = "() " + NL + "  {";
  protected final String TEXT_404 = NL + "    vector<";
  protected final String TEXT_405 = "*> ";
  protected final String TEXT_406 = " = ";
  protected final String TEXT_407 = ";";
  protected final String TEXT_408 = NL + "    return ";
  protected final String TEXT_409 = ";" + NL + "  }" + NL + "" + NL + "  int ";
  protected final String TEXT_410 = "::";
  protected final String TEXT_411 = "()" + NL + "  {";
  protected final String TEXT_412 = NL + "    int number = ";
  protected final String TEXT_413 = ".size();";
  protected final String TEXT_414 = NL + "    return number;" + NL + "  }" + NL + "" + NL + "  bool ";
  protected final String TEXT_415 = "::";
  protected final String TEXT_416 = "()" + NL + "  {";
  protected final String TEXT_417 = NL + "    bool has = ";
  protected final String TEXT_418 = ".size() > 0;";
  protected final String TEXT_419 = NL + "    return has;" + NL + "  }" + NL + "  " + NL + "  int ";
  protected final String TEXT_420 = "::";
  protected final String TEXT_421 = "(";
  protected final String TEXT_422 = "* ";
  protected final String TEXT_423 = ")" + NL + "  {";
  protected final String TEXT_424 = NL + "    int index = find(";
  protected final String TEXT_425 = ".begin(), ";
  protected final String TEXT_426 = ".end(), ";
  protected final String TEXT_427 = ") - ";
  protected final String TEXT_428 = ".begin();";
  protected final String TEXT_429 = NL + "    return index;" + NL + "  }" + NL + "  ";
  protected final String TEXT_430 = "UNABLE TO UNDERSAND association variable (see association_Get_All.jet)";
  protected final String TEXT_431 = "//FIXME - FOUND UNKNOWN ASSOCIATION RELATIONSHIP ";
  protected final String TEXT_432 = " : ";
  protected final String TEXT_433 = NL + "  bool ";
  protected final String TEXT_434 = "::";
  protected final String TEXT_435 = "()" + NL + "  {";
  protected final String TEXT_436 = NL + "    bool isValid = ";
  protected final String TEXT_437 = "() >= ";
  protected final String TEXT_438 = "();";
  protected final String TEXT_439 = NL + "    bool isValid = ";
  protected final String TEXT_440 = "() >= ";
  protected final String TEXT_441 = "() && ";
  protected final String TEXT_442 = "() <= ";
  protected final String TEXT_443 = "();";
  protected final String TEXT_444 = NL + "    return isValid;" + NL + "  }";
  protected final String TEXT_445 = NL + "  static int ";
  protected final String TEXT_446 = "::";
  protected final String TEXT_447 = "()" + NL + "  {" + NL + "    return ";
  protected final String TEXT_448 = ";" + NL + "  }";
  protected final String TEXT_449 = NL + "  static int ";
  protected final String TEXT_450 = "::";
  protected final String TEXT_451 = "()" + NL + "  {";
  protected final String TEXT_452 = NL + "    int required = ";
  protected final String TEXT_453 = ";";
  protected final String TEXT_454 = NL + "    return required;" + NL + "  }";
  protected final String TEXT_455 = NL + "  static int ";
  protected final String TEXT_456 = "()" + NL + "  {" + NL + "    return ";
  protected final String TEXT_457 = ";" + NL + "  }";
  protected final String TEXT_458 = NL + "  static int ";
  protected final String TEXT_459 = "::";
  protected final String TEXT_460 = "()" + NL + "  {";
  protected final String TEXT_461 = NL + "    int minimum = ";
  protected final String TEXT_462 = ";";
  protected final String TEXT_463 = NL + "    return minimum;" + NL + "  }";
  protected final String TEXT_464 = NL + "  static int ";
  protected final String TEXT_465 = "::";
  protected final String TEXT_466 = "()" + NL + "  {" + NL + "    return ";
  protected final String TEXT_467 = ";" + NL + "  }";
  protected final String TEXT_468 = NL + "  static int ";
  protected final String TEXT_469 = "::";
  protected final String TEXT_470 = "()" + NL + "  {";
  protected final String TEXT_471 = NL + "    int maximum = ";
  protected final String TEXT_472 = ";";
  protected final String TEXT_473 = NL + "    return maximum;" + NL + "  }";
  protected final String TEXT_474 = NL + "  bool ";
  protected final String TEXT_475 = "::";
  protected final String TEXT_476 = "(";
  protected final String TEXT_477 = "* ";
  protected final String TEXT_478 = ")" + NL + "  {" + NL + "    bool wasAdded = false;";
  protected final String TEXT_479 = NL + "    if (";
  protected final String TEXT_480 = "() >= ";
  protected final String TEXT_481 = "())" + NL + "    {";
  protected final String TEXT_482 = NL + "      return wasAdded;" + NL + "    }" + NL;
  protected final String TEXT_483 = NL + "    ";
  protected final String TEXT_484 = ".push_back(";
  protected final String TEXT_485 = ");" + NL + "    if (";
  protected final String TEXT_486 = "->";
  protected final String TEXT_487 = "(this) != -1)" + NL + "    {" + NL + "      wasAdded = true;" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      wasAdded = ";
  protected final String TEXT_488 = ".";
  protected final String TEXT_489 = "(this);" + NL + "      if (!wasAdded)" + NL + "      {";
  protected final String TEXT_490 = NL + "        ";
  protected final String TEXT_491 = ".erase(find(";
  protected final String TEXT_492 = ".begin(),";
  protected final String TEXT_493 = ".end(),";
  protected final String TEXT_494 = "));" + NL + "      }" + NL + "    }";
  protected final String TEXT_495 = NL + "    return wasAdded;" + NL + "  }";
  protected final String TEXT_496 = NL + "  bool ";
  protected final String TEXT_497 = "::";
  protected final String TEXT_498 = "(";
  protected final String TEXT_499 = " ";
  protected final String TEXT_500 = ")" + NL + "  {" + NL + "    bool wasRemoved = false;";
  protected final String TEXT_501 = NL + "    if (!find(";
  protected final String TEXT_502 = ".begin(),";
  protected final String TEXT_503 = ".end(),";
  protected final String TEXT_504 = "))" + NL + "    {";
  protected final String TEXT_505 = NL + "      return wasRemoved;" + NL + "    }" + NL + "" + NL + "    int oldIndex = find(";
  protected final String TEXT_506 = ".begin(), ";
  protected final String TEXT_507 = ".end(), ";
  protected final String TEXT_508 = ") - ";
  protected final String TEXT_509 = ".begin();";
  protected final String TEXT_510 = NL + "    ";
  protected final String TEXT_511 = ".erase(find(";
  protected final String TEXT_512 = ".begin(),";
  protected final String TEXT_513 = ".end(),";
  protected final String TEXT_514 = "));" + NL + "    if (";
  protected final String TEXT_515 = "->";
  protected final String TEXT_516 = "(this) == -1)" + NL + "    {" + NL + "      wasRemoved = true;" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      wasRemoved = ";
  protected final String TEXT_517 = "->";
  protected final String TEXT_518 = "(this);" + NL + "      if (!wasRemoved)" + NL + "      {";
  protected final String TEXT_519 = NL + "        ";
  protected final String TEXT_520 = ".push_back(oldIndex,";
  protected final String TEXT_521 = ");" + NL + "      }" + NL + "    }";
  protected final String TEXT_522 = NL + "    return wasRemoved;" + NL + "  }";
  protected final String TEXT_523 = NL + "  bool ";
  protected final String TEXT_524 = "::";
  protected final String TEXT_525 = "(";
  protected final String TEXT_526 = "* ";
  protected final String TEXT_527 = ")" + NL + "  {" + NL + "    bool wasSet = false;";
  protected final String TEXT_528 = NL + "    ";
  protected final String TEXT_529 = " = ";
  protected final String TEXT_530 = ";" + NL + "    wasSet = true;";
  protected final String TEXT_531 = NL + "    return wasSet;" + NL + "  }";
  protected final String TEXT_532 = NL + "  bool ";
  protected final String TEXT_533 = "::";
  protected final String TEXT_534 = "(";
  protected final String TEXT_535 = "* ";
  protected final String TEXT_536 = ")" + NL + "  {" + NL + "    bool wasSet = false;";
  protected final String TEXT_537 = NL + "    if (";
  protected final String TEXT_538 = " != NULL)" + NL + "    {";
  protected final String TEXT_539 = NL + "      ";
  protected final String TEXT_540 = " = ";
  protected final String TEXT_541 = ";" + NL + "      wasSet = true;" + NL + "    }";
  protected final String TEXT_542 = NL + "    return wasSet;" + NL + "  }";
  protected final String TEXT_543 = NL + "  bool ";
  protected final String TEXT_544 = "::";
  protected final String TEXT_545 = "(";
  protected final String TEXT_546 = "* ";
  protected final String TEXT_547 = ")" + NL + "  {" + NL + "    bool wasSet = false;";
  protected final String TEXT_548 = NL + "    if (";
  protected final String TEXT_549 = " != NULL && ";
  protected final String TEXT_550 = "!=";
  protected final String TEXT_551 = " && = ";
  protected final String TEXT_552 = "->";
  protected final String TEXT_553 = "())" + NL + "    {" + NL + "      //Unable to ";
  protected final String TEXT_554 = ", as existing ";
  protected final String TEXT_555 = " would become an orphan";
  protected final String TEXT_556 = NL + "      return wasSet;" + NL + "    }" + NL;
  protected final String TEXT_557 = NL + "    ";
  protected final String TEXT_558 = " = ";
  protected final String TEXT_559 = ";";
  protected final String TEXT_560 = NL + "    ";
  protected final String TEXT_561 = " ";
  protected final String TEXT_562 = " = ";
  protected final String TEXT_563 = " != NULL ? ";
  protected final String TEXT_564 = "->";
  protected final String TEXT_565 = "() : NULL;" + NL + "" + NL + "    if (this!=";
  protected final String TEXT_566 = ")" + NL + "    {" + NL + "      if (";
  protected final String TEXT_567 = " != NULL)" + NL + "      {";
  protected final String TEXT_568 = NL + "        ";
  protected final String TEXT_569 = "->";
  protected final String TEXT_570 = " = NULL;" + NL + "      }" + NL + "      if (";
  protected final String TEXT_571 = " != NULL)" + NL + "      {";
  protected final String TEXT_572 = NL + "        ";
  protected final String TEXT_573 = "->";
  protected final String TEXT_574 = "(this);" + NL + "      }" + NL + "    }" + NL + "    wasSet = true;";
  protected final String TEXT_575 = NL + "    return wasSet;" + NL + "  }";
  protected final String TEXT_576 = NL + "  bool ";
  protected final String TEXT_577 = "::";
  protected final String TEXT_578 = "(";
  protected final String TEXT_579 = " ";
  protected final String TEXT_580 = ")" + NL + "  {" + NL + "    bool";
  protected final String TEXT_581 = NL + "    if (";
  protected final String TEXT_582 = " == NULL)" + NL + "    {" + NL + "      //Unable to ";
  protected final String TEXT_583 = " to null, as ";
  protected final String TEXT_584 = " must always be associated to a ";
  protected final String TEXT_585 = NL + "      return wasSet;" + NL + "    }" + NL + "    ";
  protected final String TEXT_586 = NL + "    ";
  protected final String TEXT_587 = "* ";
  protected final String TEXT_588 = " = ";
  protected final String TEXT_589 = "->";
  protected final String TEXT_590 = "();" + NL + "    if (";
  protected final String TEXT_591 = " != NULL && !=";
  protected final String TEXT_592 = ")" + NL + "    {" + NL + "      //Unable to ";
  protected final String TEXT_593 = ", the current ";
  protected final String TEXT_594 = " already has a ";
  protected final String TEXT_595 = ", which would be orphaned if it were re-assigned";
  protected final String TEXT_596 = NL + "      return wasSet;" + NL + "    }" + NL + "    ";
  protected final String TEXT_597 = NL + "    ";
  protected final String TEXT_598 = "* ";
  protected final String TEXT_599 = " = ";
  protected final String TEXT_600 = ";";
  protected final String TEXT_601 = NL + "    ";
  protected final String TEXT_602 = " = ";
  protected final String TEXT_603 = ";";
  protected final String TEXT_604 = NL + "    ";
  protected final String TEXT_605 = "->";
  protected final String TEXT_606 = "(this);" + NL + "" + NL + "    if (";
  protected final String TEXT_607 = " != NULL)" + NL + "    {";
  protected final String TEXT_608 = NL + "      ";
  protected final String TEXT_609 = "->";
  protected final String TEXT_610 = "(null);" + NL + "    }" + NL + "    wasSet = true;";
  protected final String TEXT_611 = NL + "    return wasSet;" + NL + "  }";
  protected final String TEXT_612 = NL + "  ";
  protected final String TEXT_613 = " ";
  protected final String TEXT_614 = "::";
  protected final String TEXT_615 = "(";
  protected final String TEXT_616 = ")" + NL + "  {" + NL + "    return new ";
  protected final String TEXT_617 = "(";
  protected final String TEXT_618 = ");" + NL + "  }" + NL + "" + NL + "  bool ";
  protected final String TEXT_619 = "::";
  protected final String TEXT_620 = "(";
  protected final String TEXT_621 = "* ";
  protected final String TEXT_622 = ")" + NL + "  {" + NL + "    bool wasAdded = false;";
  protected final String TEXT_623 = NL + "    ";
  protected final String TEXT_624 = " ";
  protected final String TEXT_625 = " = ";
  protected final String TEXT_626 = "->";
  protected final String TEXT_627 = "();" + NL + "    bool ";
  protected final String TEXT_628 = " = (";
  protected final String TEXT_629 = " != NULL && this != ";
  protected final String TEXT_630 = ");" + NL + "" + NL + "    if (";
  protected final String TEXT_631 = " && ";
  protected final String TEXT_632 = "->";
  protected final String TEXT_633 = "() <= ";
  protected final String TEXT_634 = "())" + NL + "    {" + NL + "      return wasAdded;" + NL + "    }" + NL + "" + NL + "    if (";
  protected final String TEXT_635 = ")" + NL + "    {";
  protected final String TEXT_636 = NL + "      ";
  protected final String TEXT_637 = "->";
  protected final String TEXT_638 = "(this);" + NL + "    }" + NL + "    else" + NL + "    {";
  protected final String TEXT_639 = NL + "      ";
  protected final String TEXT_640 = ".add(";
  protected final String TEXT_641 = ");" + NL + "    }" + NL + "    wasAdded = true;";
  protected final String TEXT_642 = NL + "    return wasAdded;" + NL + "  }" + NL + "" + NL + "  bool ";
  protected final String TEXT_643 = "::";
  protected final String TEXT_644 = "(";
  protected final String TEXT_645 = "* ";
  protected final String TEXT_646 = ")" + NL + "  {" + NL + "    bool wasRemoved = false;" + NL + "\t";
  protected final String TEXT_647 = NL + "    //Unable to remove ";
  protected final String TEXT_648 = ", as it must always have a ";
  protected final String TEXT_649 = NL + "    if (this == ";
  protected final String TEXT_650 = "->";
  protected final String TEXT_651 = "()))" + NL + "    {";
  protected final String TEXT_652 = NL + "      return wasRemoved;" + NL + "    }" + NL + "" + NL + "    //";
  protected final String TEXT_653 = " already at minimum (";
  protected final String TEXT_654 = ")" + NL + "    if (";
  protected final String TEXT_655 = "() <= ";
  protected final String TEXT_656 = "())" + NL + "    {";
  protected final String TEXT_657 = NL + "      return wasRemoved;" + NL + "    }" + NL;
  protected final String TEXT_658 = NL + "    ";
  protected final String TEXT_659 = ".remove(";
  protected final String TEXT_660 = ");" + NL + "    wasRemoved = true;";
  protected final String TEXT_661 = NL + "    return wasRemoved;" + NL + "  }";
  protected final String TEXT_662 = NL + "  ";
  protected final String TEXT_663 = " ";
  protected final String TEXT_664 = "::";
  protected final String TEXT_665 = "(";
  protected final String TEXT_666 = ")" + NL + "  {" + NL + "    if (";
  protected final String TEXT_667 = "() >= ";
  protected final String TEXT_668 = "())" + NL + "    {" + NL + "      return null;" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      return new ";
  protected final String TEXT_669 = "(";
  protected final String TEXT_670 = ");" + NL + "    }" + NL + "  }" + NL + "" + NL + "  bool ";
  protected final String TEXT_671 = "::";
  protected final String TEXT_672 = "(";
  protected final String TEXT_673 = "* ";
  protected final String TEXT_674 = ")" + NL + "  {" + NL + "    bool wasAdded = false;";
  protected final String TEXT_675 = NL + "    if (";
  protected final String TEXT_676 = "() >= ";
  protected final String TEXT_677 = "())" + NL + "    {";
  protected final String TEXT_678 = NL + "      return wasAdded;" + NL + "    }" + NL;
  protected final String TEXT_679 = NL + "    ";
  protected final String TEXT_680 = " ";
  protected final String TEXT_681 = " = ";
  protected final String TEXT_682 = "->";
  protected final String TEXT_683 = "();" + NL + "    bool ";
  protected final String TEXT_684 = " = (";
  protected final String TEXT_685 = " != NULL && this!=";
  protected final String TEXT_686 = ");" + NL + "" + NL + "    if (";
  protected final String TEXT_687 = " && ";
  protected final String TEXT_688 = "->";
  protected final String TEXT_689 = "() <= ";
  protected final String TEXT_690 = "())" + NL + "    {";
  protected final String TEXT_691 = NL + "      return wasAdded;" + NL + "    }" + NL + "" + NL + "    if (";
  protected final String TEXT_692 = ")" + NL + "    {";
  protected final String TEXT_693 = NL + "      ";
  protected final String TEXT_694 = "->";
  protected final String TEXT_695 = "(this);" + NL + "    }" + NL + "    else" + NL + "    {";
  protected final String TEXT_696 = NL + "      ";
  protected final String TEXT_697 = ".add(";
  protected final String TEXT_698 = ");" + NL + "    }" + NL + "    wasAdded = true;";
  protected final String TEXT_699 = NL + "    return wasAdded;" + NL + "  }" + NL + "" + NL + "  bool ";
  protected final String TEXT_700 = "::";
  protected final String TEXT_701 = "(";
  protected final String TEXT_702 = "* ";
  protected final String TEXT_703 = ")" + NL + "  {" + NL + "    bool wasRemoved = false;" + NL + "\tint index = find(";
  protected final String TEXT_704 = ".begin(), ";
  protected final String TEXT_705 = ".end(), ";
  protected final String TEXT_706 = ") - ";
  protected final String TEXT_707 = ".begin();";
  protected final String TEXT_708 = NL + "    //Unable to remove ";
  protected final String TEXT_709 = ", as it must always have a ";
  protected final String TEXT_710 = NL + "    if (this == ";
  protected final String TEXT_711 = "->";
  protected final String TEXT_712 = "())" + NL + "    {";
  protected final String TEXT_713 = NL + "      return wasRemoved;" + NL + "    }" + NL + "" + NL + "    //";
  protected final String TEXT_714 = " already at minimum (";
  protected final String TEXT_715 = ")" + NL + "    if (";
  protected final String TEXT_716 = "() <= ";
  protected final String TEXT_717 = "())" + NL + "    {";
  protected final String TEXT_718 = NL + "      return wasRemoved;" + NL + "    }" + NL;
  protected final String TEXT_719 = NL + "    ";
  protected final String TEXT_720 = ".erase(find(";
  protected final String TEXT_721 = ".begin(),";
  protected final String TEXT_722 = ".end(),";
  protected final String TEXT_723 = "));" + NL + "\tdelete ";
  protected final String TEXT_724 = "[index];" + NL + "    wasRemoved = true;";
  protected final String TEXT_725 = NL + "    return wasRemoved;" + NL + "  }";
  protected final String TEXT_726 = NL + "  ";
  protected final String TEXT_727 = " ";
  protected final String TEXT_728 = "::";
  protected final String TEXT_729 = "(";
  protected final String TEXT_730 = ")" + NL + "  {" + NL + "    if (";
  protected final String TEXT_731 = "() >= ";
  protected final String TEXT_732 = "())" + NL + "    {" + NL + "      return null;" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      return new ";
  protected final String TEXT_733 = "(";
  protected final String TEXT_734 = ");" + NL + "    }" + NL + "  }" + NL + "" + NL + "  bool ";
  protected final String TEXT_735 = "::";
  protected final String TEXT_736 = "(";
  protected final String TEXT_737 = "* ";
  protected final String TEXT_738 = ")" + NL + "  {" + NL + "    bool wasAdded = false;";
  protected final String TEXT_739 = NL + "    if (";
  protected final String TEXT_740 = "() >= ";
  protected final String TEXT_741 = "())" + NL + "    {";
  protected final String TEXT_742 = NL + "      return wasAdded;" + NL + "    }" + NL;
  protected final String TEXT_743 = NL + "    ";
  protected final String TEXT_744 = " ";
  protected final String TEXT_745 = " = ";
  protected final String TEXT_746 = "->";
  protected final String TEXT_747 = "();" + NL + "    bool ";
  protected final String TEXT_748 = " = (";
  protected final String TEXT_749 = " != NULL && this != ";
  protected final String TEXT_750 = ");" + NL + "    if (";
  protected final String TEXT_751 = ")" + NL + "    {";
  protected final String TEXT_752 = NL + "      ";
  protected final String TEXT_753 = "->";
  protected final String TEXT_754 = "(this);" + NL + "    }" + NL + "    else" + NL + "    {";
  protected final String TEXT_755 = NL + "      ";
  protected final String TEXT_756 = ".push_back(";
  protected final String TEXT_757 = ");" + NL + "    }" + NL + "    wasAdded = true;";
  protected final String TEXT_758 = NL + "    return wasAdded;" + NL + "  }" + NL + "" + NL + "  bool ";
  protected final String TEXT_759 = "::";
  protected final String TEXT_760 = "(";
  protected final String TEXT_761 = "* ";
  protected final String TEXT_762 = ")" + NL + "  {" + NL + "    bool wasRemoved = false;" + NL + "\tint index = find(";
  protected final String TEXT_763 = ".begin(), ";
  protected final String TEXT_764 = ".end(), ";
  protected final String TEXT_765 = ") - ";
  protected final String TEXT_766 = ".begin();";
  protected final String TEXT_767 = NL + "    //Unable to remove ";
  protected final String TEXT_768 = ", as it must always have a ";
  protected final String TEXT_769 = NL + "    if (this != ";
  protected final String TEXT_770 = "->";
  protected final String TEXT_771 = "())" + NL + "    {";
  protected final String TEXT_772 = NL + "      ";
  protected final String TEXT_773 = ".erase(find(";
  protected final String TEXT_774 = ".begin(),";
  protected final String TEXT_775 = ".end(),";
  protected final String TEXT_776 = "));" + NL + "\t  delete ";
  protected final String TEXT_777 = "[index];" + NL + "      wasRemoved = true;" + NL + "    }";
  protected final String TEXT_778 = NL + "    return wasRemoved;" + NL + "  }";
  protected final String TEXT_779 = NL + "  bool ";
  protected final String TEXT_780 = "::";
  protected final String TEXT_781 = "(";
  protected final String TEXT_782 = "... ";
  protected final String TEXT_783 = ")" + NL + "  {" + NL + "    bool wasSet = false;";
  protected final String TEXT_784 = NL + "    vector<";
  protected final String TEXT_785 = "*> ";
  protected final String TEXT_786 = ";" + NL + "\t" + NL + "    for (";
  protected final String TEXT_787 = " ";
  protected final String TEXT_788 = " : ";
  protected final String TEXT_789 = ")" + NL + "    {" + NL + "      if (find(";
  protected final String TEXT_790 = ".begin(),";
  protected final String TEXT_791 = ".end(),";
  protected final String TEXT_792 = ") != ";
  protected final String TEXT_793 = ".end())" + NL + "      {" + NL + "        continue;" + NL + "      }";
  protected final String TEXT_794 = NL + "      ";
  protected final String TEXT_795 = "->add(";
  protected final String TEXT_796 = ");" + NL + "    }" + NL + "" + NL + "    if (";
  protected final String TEXT_797 = ".size() != ";
  protected final String TEXT_798 = ".length || ";
  protected final String TEXT_799 = ".size() > ";
  protected final String TEXT_800 = "())" + NL + "    {";
  protected final String TEXT_801 = NL + "      return wasSet;" + NL + "    }" + NL + "" + NL + "    vector<";
  protected final String TEXT_802 = "*> ";
  protected final String TEXT_803 = ";";
  protected final String TEXT_804 = NL + "    ";
  protected final String TEXT_805 = ".clear();" + NL + "    for (";
  protected final String TEXT_806 = " ";
  protected final String TEXT_807 = " : ";
  protected final String TEXT_808 = ")" + NL + "    {";
  protected final String TEXT_809 = NL + "      ";
  protected final String TEXT_810 = "->add(";
  protected final String TEXT_811 = ");" + NL + "      if (find(";
  protected final String TEXT_812 = ".begin(),";
  protected final String TEXT_813 = ".end(),";
  protected final String TEXT_814 = ") != ";
  protected final String TEXT_815 = ".end())" + NL + "      {";
  protected final String TEXT_816 = NL + "        ";
  protected final String TEXT_817 = ".erase(";
  protected final String TEXT_818 = ");" + NL + "      }" + NL + "      else" + NL + "      {";
  protected final String TEXT_819 = NL + "        ";
  protected final String TEXT_820 = "->";
  protected final String TEXT_821 = "(this);" + NL + "      }" + NL + "    }" + NL + "" + NL + "    for (";
  protected final String TEXT_822 = " ";
  protected final String TEXT_823 = " : ";
  protected final String TEXT_824 = ")" + NL + "    {";
  protected final String TEXT_825 = NL + "      ";
  protected final String TEXT_826 = "->";
  protected final String TEXT_827 = "(this);" + NL + "    }" + NL + "    wasSet = true;";
  protected final String TEXT_828 = NL + "    return wasSet;" + NL + "  }";
  protected final String TEXT_829 = NL + "  ";
  protected final String TEXT_830 = " ";
  protected final String TEXT_831 = "::";
  protected final String TEXT_832 = "(";
  protected final String TEXT_833 = ")" + NL + "  {" + NL + "    return new ";
  protected final String TEXT_834 = "(";
  protected final String TEXT_835 = ");" + NL + "  }" + NL + "" + NL + "  bool ";
  protected final String TEXT_836 = "::";
  protected final String TEXT_837 = "(";
  protected final String TEXT_838 = "* ";
  protected final String TEXT_839 = ")" + NL + "  {" + NL + "    bool wasAdded = false;";
  protected final String TEXT_840 = NL + "    ";
  protected final String TEXT_841 = "* ";
  protected final String TEXT_842 = " = ";
  protected final String TEXT_843 = "->";
  protected final String TEXT_844 = "();" + NL + "    bool ";
  protected final String TEXT_845 = " = (";
  protected final String TEXT_846 = " != NULL && this!=";
  protected final String TEXT_847 = ");" + NL + "    if (";
  protected final String TEXT_848 = ")" + NL + "    {";
  protected final String TEXT_849 = NL + "      ";
  protected final String TEXT_850 = "->";
  protected final String TEXT_851 = "(this);" + NL + "    }" + NL + "    else" + NL + "    {";
  protected final String TEXT_852 = NL + "      ";
  protected final String TEXT_853 = ".push_back(";
  protected final String TEXT_854 = ");" + NL + "    }" + NL + "    wasAdded = true;";
  protected final String TEXT_855 = NL + "    return wasAdded;" + NL + "  }" + NL + "" + NL + "  bool ";
  protected final String TEXT_856 = "::";
  protected final String TEXT_857 = "(";
  protected final String TEXT_858 = "* ";
  protected final String TEXT_859 = ")" + NL + "  {" + NL + "    bool wasRemoved = false;" + NL + "\tint index = find(";
  protected final String TEXT_860 = ".begin(), ";
  protected final String TEXT_861 = ".end(), ";
  protected final String TEXT_862 = ") - ";
  protected final String TEXT_863 = ".begin();";
  protected final String TEXT_864 = NL + "    //Unable to remove ";
  protected final String TEXT_865 = ", as it must always have a ";
  protected final String TEXT_866 = NL + "    if (this!=";
  protected final String TEXT_867 = "->";
  protected final String TEXT_868 = "())" + NL + "    {";
  protected final String TEXT_869 = NL + "      ";
  protected final String TEXT_870 = ".erase(find(";
  protected final String TEXT_871 = ".begin(),";
  protected final String TEXT_872 = ".end(),";
  protected final String TEXT_873 = "));" + NL + "\t  delete ";
  protected final String TEXT_874 = "[index];" + NL + "      wasRemoved = true;" + NL + "    }";
  protected final String TEXT_875 = NL + "    return wasRemoved;" + NL + "  }";
  protected final String TEXT_876 = NL + "  bool ";
  protected final String TEXT_877 = "::";
  protected final String TEXT_878 = "(";
  protected final String TEXT_879 = "* ";
  protected final String TEXT_880 = ")" + NL + "  {" + NL + "    bool wasSet = false;";
  protected final String TEXT_881 = NL + "    if (";
  protected final String TEXT_882 = " == NULL)" + NL + "    {";
  protected final String TEXT_883 = NL + "      ";
  protected final String TEXT_884 = " ";
  protected final String TEXT_885 = " = ";
  protected final String TEXT_886 = ";";
  protected final String TEXT_887 = NL + "      ";
  protected final String TEXT_888 = " = NULL;" + NL + "      " + NL + "      if (";
  protected final String TEXT_889 = " != NULL && ";
  protected final String TEXT_890 = "->";
  protected final String TEXT_891 = "() != NULL)" + NL + "      {";
  protected final String TEXT_892 = NL + "        ";
  protected final String TEXT_893 = "->";
  protected final String TEXT_894 = "(NULL);" + NL + "      }" + NL + "      wasSet = true;";
  protected final String TEXT_895 = NL + "      return wasSet;" + NL + "    }" + NL;
  protected final String TEXT_896 = NL + "    ";
  protected final String TEXT_897 = "* ";
  protected final String TEXT_898 = " = ";
  protected final String TEXT_899 = "();" + NL + "    if (";
  protected final String TEXT_900 = " != NULL && ";
  protected final String TEXT_901 = "!=";
  protected final String TEXT_902 = ")" + NL + "    {";
  protected final String TEXT_903 = NL + "      ";
  protected final String TEXT_904 = "->";
  protected final String TEXT_905 = "(NULL);" + NL + "    }" + NL;
  protected final String TEXT_906 = NL + "    ";
  protected final String TEXT_907 = " = ";
  protected final String TEXT_908 = ";";
  protected final String TEXT_909 = NL + "    ";
  protected final String TEXT_910 = "* ";
  protected final String TEXT_911 = " = ";
  protected final String TEXT_912 = "->";
  protected final String TEXT_913 = "();" + NL + "" + NL + "    if (!=";
  protected final String TEXT_914 = ")" + NL + "    {";
  protected final String TEXT_915 = NL + "      ";
  protected final String TEXT_916 = "->";
  protected final String TEXT_917 = "(this);" + NL + "    }" + NL + "    wasSet = true;";
  protected final String TEXT_918 = NL + "    return wasSet;" + NL + "  }";
  protected final String TEXT_919 = NL + "  bool ";
  protected final String TEXT_920 = "::";
  protected final String TEXT_921 = "(";
  protected final String TEXT_922 = "* ";
  protected final String TEXT_923 = ")" + NL + "  {" + NL + "    bool wasRemoved = false;" + NL + "\tint index = find(";
  protected final String TEXT_924 = ".begin(), ";
  protected final String TEXT_925 = ".end(), ";
  protected final String TEXT_926 = ") - ";
  protected final String TEXT_927 = ".begin();";
  protected final String TEXT_928 = NL + "    if (! find(";
  protected final String TEXT_929 = ".begin(),";
  protected final String TEXT_930 = ".end(),";
  protected final String TEXT_931 = "))" + NL + "    {";
  protected final String TEXT_932 = NL + "      return wasRemoved;" + NL + "    }" + NL + "" + NL + "    if (";
  protected final String TEXT_933 = "() <= ";
  protected final String TEXT_934 = "())" + NL + "    {";
  protected final String TEXT_935 = NL + "      return wasRemoved;" + NL + "    }" + NL + "\t" + NL + "    int oldIndex = find(";
  protected final String TEXT_936 = ".begin(), ";
  protected final String TEXT_937 = ".end(), ";
  protected final String TEXT_938 = ") - ";
  protected final String TEXT_939 = ".begin();";
  protected final String TEXT_940 = NL + "    ";
  protected final String TEXT_941 = ".erase(find(";
  protected final String TEXT_942 = ".begin(), ";
  protected final String TEXT_943 = ".end(), ";
  protected final String TEXT_944 = "));" + NL + "\tdelete ";
  protected final String TEXT_945 = "[oldIndex];" + NL + "    if (";
  protected final String TEXT_946 = "->";
  protected final String TEXT_947 = "(this) == -1)" + NL + "    {" + NL + "      wasRemoved = true;" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      wasRemoved = ";
  protected final String TEXT_948 = "->";
  protected final String TEXT_949 = "(this);" + NL + "      if (!wasRemoved)" + NL + "      {";
  protected final String TEXT_950 = NL + "        ";
  protected final String TEXT_951 = "->add(oldIndex,";
  protected final String TEXT_952 = ");" + NL + "      }" + NL + "    }";
  protected final String TEXT_953 = NL + "    return wasRemoved;" + NL + "  }";
  protected final String TEXT_954 = NL + "  bool ";
  protected final String TEXT_955 = "::";
  protected final String TEXT_956 = "(";
  protected final String TEXT_957 = "* ";
  protected final String TEXT_958 = ")" + NL + "  {" + NL + "    bool wasRemoved = false;" + NL + "\tint index = find(";
  protected final String TEXT_959 = ".begin(), ";
  protected final String TEXT_960 = ".end(), ";
  protected final String TEXT_961 = ") - ";
  protected final String TEXT_962 = ".begin();";
  protected final String TEXT_963 = NL + "    if (! find(";
  protected final String TEXT_964 = ".begin(),";
  protected final String TEXT_965 = ".end(),";
  protected final String TEXT_966 = ") != ";
  protected final String TEXT_967 = ".end())" + NL + "    {";
  protected final String TEXT_968 = NL + "      return wasRemoved;" + NL + "    }" + NL + "" + NL + "    if (";
  protected final String TEXT_969 = "() <= ";
  protected final String TEXT_970 = "())" + NL + "    {";
  protected final String TEXT_971 = NL + "      return wasRemoved;" + NL + "    }" + NL + "" + NL + "    int oldIndex = find(";
  protected final String TEXT_972 = ".begin(), ";
  protected final String TEXT_973 = ".end(), ";
  protected final String TEXT_974 = ") - ";
  protected final String TEXT_975 = ".begin();";
  protected final String TEXT_976 = NL + "    ";
  protected final String TEXT_977 = ".erase(oldIndex);" + NL + "\tdelete ";
  protected final String TEXT_978 = "[oldIndex];" + NL + "    if (";
  protected final String TEXT_979 = "->";
  protected final String TEXT_980 = "(this) == -1)" + NL + "    {" + NL + "      wasRemoved = true;" + NL + "    }" + NL + "    else" + NL + "    {" + NL + "      wasRemoved = ";
  protected final String TEXT_981 = ".";
  protected final String TEXT_982 = "(this);" + NL + "      if (!wasRemoved)" + NL + "      {";
  protected final String TEXT_983 = NL + "        ";
  protected final String TEXT_984 = ".add(oldIndex,";
  protected final String TEXT_985 = ");" + NL + "      }" + NL + "    }";
  protected final String TEXT_986 = NL + "    return wasRemoved;" + NL + "  }";
  protected final String TEXT_987 = NL + "  bool ";
  protected final String TEXT_988 = "::";
  protected final String TEXT_989 = "(";
  protected final String TEXT_990 = "* ";
  protected final String TEXT_991 = ")" + NL + "  {" + NL + "    bool wasSet = false;";
  protected final String TEXT_992 = NL + "    if (";
  protected final String TEXT_993 = " != NULL && ";
  protected final String TEXT_994 = "->";
  protected final String TEXT_995 = "() >= ";
  protected final String TEXT_996 = "->";
  protected final String TEXT_997 = "())" + NL + "    {";
  protected final String TEXT_998 = NL + "      return wasSet;" + NL + "    }" + NL;
  protected final String TEXT_999 = NL + "    ";
  protected final String TEXT_1000 = "* ";
  protected final String TEXT_1001 = " = ";
  protected final String TEXT_1002 = ";";
  protected final String TEXT_1003 = NL + "    ";
  protected final String TEXT_1004 = " = ";
  protected final String TEXT_1005 = ";" + NL + "    if (";
  protected final String TEXT_1006 = " != NULL && ";
  protected final String TEXT_1007 = "!=";
  protected final String TEXT_1008 = ")" + NL + "    {";
  protected final String TEXT_1009 = NL + "      ";
  protected final String TEXT_1010 = "->";
  protected final String TEXT_1011 = "(this);" + NL + "    }" + NL + "    if (";
  protected final String TEXT_1012 = " != null)" + NL + "    {";
  protected final String TEXT_1013 = NL + "      ";
  protected final String TEXT_1014 = "->";
  protected final String TEXT_1015 = "(this);" + NL + "    }" + NL + "    wasSet = true;";
  protected final String TEXT_1016 = NL + "    return wasSet;" + NL + "  }";
  protected final String TEXT_1017 = NL + "  bool ";
  protected final String TEXT_1018 = "::";
  protected final String TEXT_1019 = "(";
  protected final String TEXT_1020 = "* ";
  protected final String TEXT_1021 = ")" + NL + "  {" + NL + "    bool wasSet = false;";
  protected final String TEXT_1022 = NL + "    if (";
  protected final String TEXT_1023 = " == NULL)" + NL + "    {";
  protected final String TEXT_1024 = NL + "      return wasSet;" + NL + "    }" + NL;
  protected final String TEXT_1025 = NL + "    ";
  protected final String TEXT_1026 = "* ";
  protected final String TEXT_1027 = " = ";
  protected final String TEXT_1028 = ";";
  protected final String TEXT_1029 = NL + "    ";
  protected final String TEXT_1030 = " = ";
  protected final String TEXT_1031 = ";" + NL + "    if (";
  protected final String TEXT_1032 = " != NULL && ";
  protected final String TEXT_1033 = "!=";
  protected final String TEXT_1034 = ")" + NL + "    {";
  protected final String TEXT_1035 = NL + "      ";
  protected final String TEXT_1036 = "->";
  protected final String TEXT_1037 = "(this);" + NL + "    }";
  protected final String TEXT_1038 = NL + "    ";
  protected final String TEXT_1039 = "->";
  protected final String TEXT_1040 = "(this);" + NL + "    wasSet = true;";
  protected final String TEXT_1041 = NL + "    return wasSet;" + NL + "  }" + NL;
  protected final String TEXT_1042 = NL + "  bool ";
  protected final String TEXT_1043 = "::";
  protected final String TEXT_1044 = "(";
  protected final String TEXT_1045 = "* ";
  protected final String TEXT_1046 = ")" + NL + "  {" + NL + "    bool wasSet = false;";
  protected final String TEXT_1047 = NL + "    //Must provide ";
  protected final String TEXT_1048 = " to ";
  protected final String TEXT_1049 = NL + "    if (";
  protected final String TEXT_1050 = " == NULL)" + NL + "    {";
  protected final String TEXT_1051 = NL + "      return wasSet;" + NL + "    }" + NL + "" + NL + "    //";
  protected final String TEXT_1052 = " already at maximum (";
  protected final String TEXT_1053 = ")" + NL + "    if (";
  protected final String TEXT_1054 = "->";
  protected final String TEXT_1055 = "() >= ";
  protected final String TEXT_1056 = "->";
  protected final String TEXT_1057 = "())" + NL + "    {";
  protected final String TEXT_1058 = NL + "      return wasSet;" + NL + "    }" + NL + "    ";
  protected final String TEXT_1059 = NL + "    ";
  protected final String TEXT_1060 = "* ";
  protected final String TEXT_1061 = " = ";
  protected final String TEXT_1062 = ";";
  protected final String TEXT_1063 = NL + "    ";
  protected final String TEXT_1064 = " = ";
  protected final String TEXT_1065 = ";" + NL + "    if (";
  protected final String TEXT_1066 = " != NULL && ";
  protected final String TEXT_1067 = "!=";
  protected final String TEXT_1068 = "))" + NL + "    {" + NL + "      bool didRemove = ";
  protected final String TEXT_1069 = "->";
  protected final String TEXT_1070 = "(this);" + NL + "      if (!didRemove)" + NL + "      {";
  protected final String TEXT_1071 = NL + "        ";
  protected final String TEXT_1072 = " = ";
  protected final String TEXT_1073 = ";";
  protected final String TEXT_1074 = NL + "        return wasSet;" + NL + "      }" + NL + "    }";
  protected final String TEXT_1075 = NL + "    ";
  protected final String TEXT_1076 = "->";
  protected final String TEXT_1077 = "(this);" + NL + "    wasSet = true;";
  protected final String TEXT_1078 = NL + "    return wasSet;" + NL + "  }";
  protected final String TEXT_1079 = NL + "  bool ";
  protected final String TEXT_1080 = "::";
  protected final String TEXT_1081 = "(";
  protected final String TEXT_1082 = "* ";
  protected final String TEXT_1083 = ")" + NL + "  {" + NL + "    bool wasSet = false;";
  protected final String TEXT_1084 = NL + "    //Must provide ";
  protected final String TEXT_1085 = " to ";
  protected final String TEXT_1086 = NL + "    if (";
  protected final String TEXT_1087 = " == NULL)" + NL + "    {";
  protected final String TEXT_1088 = NL + "      return wasSet;" + NL + "    }" + NL + "" + NL + "    if (";
  protected final String TEXT_1089 = " != NULL && ";
  protected final String TEXT_1090 = ".";
  protected final String TEXT_1091 = "() <= ";
  protected final String TEXT_1092 = ".";
  protected final String TEXT_1093 = "())" + NL + "    {";
  protected final String TEXT_1094 = NL + "      return wasSet;" + NL + "    }" + NL;
  protected final String TEXT_1095 = NL + "    ";
  protected final String TEXT_1096 = "* ";
  protected final String TEXT_1097 = " = ";
  protected final String TEXT_1098 = ";";
  protected final String TEXT_1099 = NL + "    ";
  protected final String TEXT_1100 = " = ";
  protected final String TEXT_1101 = ";" + NL + "    if (";
  protected final String TEXT_1102 = " != NULL && ";
  protected final String TEXT_1103 = "!=";
  protected final String TEXT_1104 = ")" + NL + "    {" + NL + "      bool didRemove = ";
  protected final String TEXT_1105 = "->";
  protected final String TEXT_1106 = "(this);" + NL + "      if (!didRemove)" + NL + "      {";
  protected final String TEXT_1107 = NL + "        ";
  protected final String TEXT_1108 = " = ";
  protected final String TEXT_1109 = ";";
  protected final String TEXT_1110 = NL + "        return wasSet;" + NL + "      }" + NL + "    }";
  protected final String TEXT_1111 = NL + "    ";
  protected final String TEXT_1112 = "->";
  protected final String TEXT_1113 = "(this);" + NL + "    wasSet = true;";
  protected final String TEXT_1114 = NL + "    return wasSet;" + NL + "  }";
  protected final String TEXT_1115 = NL + "  bool ";
  protected final String TEXT_1116 = "::";
  protected final String TEXT_1117 = "(";
  protected final String TEXT_1118 = "* ";
  protected final String TEXT_1119 = ")" + NL + "  {" + NL + "    bool wasAdded = false;";
  protected final String TEXT_1120 = NL + "    ";
  protected final String TEXT_1121 = "* ";
  protected final String TEXT_1122 = " = ";
  protected final String TEXT_1123 = "->";
  protected final String TEXT_1124 = "();" + NL + "    if (";
  protected final String TEXT_1125 = " == NULL)" + NL + "    {";
  protected final String TEXT_1126 = NL + "      ";
  protected final String TEXT_1127 = "->";
  protected final String TEXT_1128 = "(this);" + NL + "    }" + NL + "    else if (this!=";
  protected final String TEXT_1129 = ")" + NL + "    {";
  protected final String TEXT_1130 = NL + "      ";
  protected final String TEXT_1131 = "->";
  protected final String TEXT_1132 = "(";
  protected final String TEXT_1133 = ");";
  protected final String TEXT_1134 = NL + "      ";
  protected final String TEXT_1135 = "(";
  protected final String TEXT_1136 = ");" + NL + "    } " + NL + "    else" + NL + "    {";
  protected final String TEXT_1137 = NL + "      ";
  protected final String TEXT_1138 = ".push_back(";
  protected final String TEXT_1139 = ");" + NL + "    }" + NL + "    wasAdded = true;";
  protected final String TEXT_1140 = NL + "    return wasAdded;" + NL + "  }" + NL + "" + NL + "  bool ";
  protected final String TEXT_1141 = "::";
  protected final String TEXT_1142 = "(";
  protected final String TEXT_1143 = "* ";
  protected final String TEXT_1144 = ")" + NL + "  {" + NL + "    bool wasRemoved = false;" + NL + "\tint index = find(";
  protected final String TEXT_1145 = ".begin(), ";
  protected final String TEXT_1146 = ".end(), ";
  protected final String TEXT_1147 = ") - ";
  protected final String TEXT_1148 = ".begin();";
  protected final String TEXT_1149 = NL + "    if (find(";
  protected final String TEXT_1150 = ".begin(),";
  protected final String TEXT_1151 = ".end(),";
  protected final String TEXT_1152 = ")!= ";
  protected final String TEXT_1153 = ".end())" + NL + "    {";
  protected final String TEXT_1154 = NL + "      ";
  protected final String TEXT_1155 = ".erase(find(";
  protected final String TEXT_1156 = ".begin(),";
  protected final String TEXT_1157 = ".end(),";
  protected final String TEXT_1158 = "));";
  protected final String TEXT_1159 = NL + "      ";
  protected final String TEXT_1160 = "->";
  protected final String TEXT_1161 = "(NULL);" + NL + "\t  delete ";
  protected final String TEXT_1162 = "[index];" + NL + "      wasRemoved = true;" + NL + "    }";
  protected final String TEXT_1163 = NL + "    return wasRemoved;" + NL + "  }";
  protected final String TEXT_1164 = NL + "  bool ";
  protected final String TEXT_1165 = "::";
  protected final String TEXT_1166 = "(";
  protected final String TEXT_1167 = "* ";
  protected final String TEXT_1168 = ")" + NL + "  {" + NL + "    bool wasSet = false;";
  protected final String TEXT_1169 = NL + "    ";
  protected final String TEXT_1170 = "* ";
  protected final String TEXT_1171 = " = ";
  protected final String TEXT_1172 = ";";
  protected final String TEXT_1173 = NL + "    ";
  protected final String TEXT_1174 = " = ";
  protected final String TEXT_1175 = ";" + NL + "    if (";
  protected final String TEXT_1176 = " != NULL && ";
  protected final String TEXT_1177 = "!=";
  protected final String TEXT_1178 = ")" + NL + "    {";
  protected final String TEXT_1179 = NL + "      ";
  protected final String TEXT_1180 = "->";
  protected final String TEXT_1181 = "(this);" + NL + "    }" + NL + "    if (";
  protected final String TEXT_1182 = " != NULL)" + NL + "    {";
  protected final String TEXT_1183 = NL + "      ";
  protected final String TEXT_1184 = "->";
  protected final String TEXT_1185 = "(this);" + NL + "    }" + NL + "    wasSet = true;";
  protected final String TEXT_1186 = NL + "    return wasSet;" + NL + "  }";
  protected final String TEXT_1187 = NL + "  bool ";
  protected final String TEXT_1188 = "::";
  protected final String TEXT_1189 = "(";
  protected final String TEXT_1190 = "* ";
  protected final String TEXT_1191 = ")" + NL + "  {" + NL + "    bool wasAdded = false;";
  protected final String TEXT_1192 = NL + "    if (";
  protected final String TEXT_1193 = "() >= ";
  protected final String TEXT_1194 = "())" + NL + "    {";
  protected final String TEXT_1195 = NL + "      return wasAdded;" + NL + "    }" + NL;
  protected final String TEXT_1196 = NL + "    ";
  protected final String TEXT_1197 = " ";
  protected final String TEXT_1198 = " = ";
  protected final String TEXT_1199 = "->";
  protected final String TEXT_1200 = "();" + NL + "    if (";
  protected final String TEXT_1201 = " == NULL)" + NL + "    {";
  protected final String TEXT_1202 = NL + "      ";
  protected final String TEXT_1203 = "->";
  protected final String TEXT_1204 = "(this);" + NL + "    }" + NL + "    else if (this!=";
  protected final String TEXT_1205 = ")" + NL + "    {";
  protected final String TEXT_1206 = NL + "      ";
  protected final String TEXT_1207 = "->";
  protected final String TEXT_1208 = "(";
  protected final String TEXT_1209 = ");";
  protected final String TEXT_1210 = NL + "      ";
  protected final String TEXT_1211 = "(";
  protected final String TEXT_1212 = ");" + NL + "    }" + NL + "    else" + NL + "    {";
  protected final String TEXT_1213 = NL + "      ";
  protected final String TEXT_1214 = ".push_back(";
  protected final String TEXT_1215 = ");" + NL + "    }" + NL + "    wasAdded = true;";
  protected final String TEXT_1216 = NL + "    return wasAdded;" + NL + "  }" + NL + "" + NL + "  bool ";
  protected final String TEXT_1217 = "::";
  protected final String TEXT_1218 = "(";
  protected final String TEXT_1219 = "* ";
  protected final String TEXT_1220 = ")" + NL + "  {" + NL + "    bool wasRemoved = false;" + NL + "\tint index = find(";
  protected final String TEXT_1221 = ".begin(), ";
  protected final String TEXT_1222 = ".end(), ";
  protected final String TEXT_1223 = ") - ";
  protected final String TEXT_1224 = ".begin();";
  protected final String TEXT_1225 = NL + "    if (find(";
  protected final String TEXT_1226 = ".begin(),";
  protected final String TEXT_1227 = ".end(),";
  protected final String TEXT_1228 = ") != ";
  protected final String TEXT_1229 = ".end())" + NL + "    {";
  protected final String TEXT_1230 = NL + "      ";
  protected final String TEXT_1231 = ".remove(";
  protected final String TEXT_1232 = ");";
  protected final String TEXT_1233 = NL + "      ";
  protected final String TEXT_1234 = "->";
  protected final String TEXT_1235 = "(NULL);" + NL + "\t  delete ";
  protected final String TEXT_1236 = "[index];" + NL + "      wasRemoved = true;" + NL + "    }";
  protected final String TEXT_1237 = NL + "    return wasRemoved;" + NL + "  }";
  protected final String TEXT_1238 = NL + "  bool ";
  protected final String TEXT_1239 = "::";
  protected final String TEXT_1240 = "(";
  protected final String TEXT_1241 = " ";
  protected final String TEXT_1242 = ")" + NL + "  {" + NL + "    bool wasAdded = false;";
  protected final String TEXT_1243 = NL + "    if (";
  protected final String TEXT_1244 = "() < ";
  protected final String TEXT_1245 = "())" + NL + "    {";
  protected final String TEXT_1246 = NL + "      ";
  protected final String TEXT_1247 = ".push_back(";
  protected final String TEXT_1248 = ");" + NL + "      wasAdded = true;" + NL + "    }";
  protected final String TEXT_1249 = NL + "    return wasAdded;" + NL + "  }" + NL + "" + NL + "  bool ";
  protected final String TEXT_1250 = "::";
  protected final String TEXT_1251 = "(";
  protected final String TEXT_1252 = "* ";
  protected final String TEXT_1253 = ")" + NL + "  {" + NL + "    bool wasRemoved = false;" + NL + "\tint index = find(";
  protected final String TEXT_1254 = ".begin(), ";
  protected final String TEXT_1255 = ".end(), ";
  protected final String TEXT_1256 = ") - ";
  protected final String TEXT_1257 = ".begin();";
  protected final String TEXT_1258 = NL + "    if (!find(";
  protected final String TEXT_1259 = ".begin(),";
  protected final String TEXT_1260 = ".end(),";
  protected final String TEXT_1261 = ") != ";
  protected final String TEXT_1262 = ".end())" + NL + "    {";
  protected final String TEXT_1263 = NL + "      return wasRemoved;" + NL + "    }" + NL + "" + NL + "    if (";
  protected final String TEXT_1264 = "() <= ";
  protected final String TEXT_1265 = "())" + NL + "    {";
  protected final String TEXT_1266 = NL + "      return wasRemoved;" + NL + "    }" + NL;
  protected final String TEXT_1267 = NL + "    ";
  protected final String TEXT_1268 = ".erase(find(";
  protected final String TEXT_1269 = ".begin(),";
  protected final String TEXT_1270 = ".end(),";
  protected final String TEXT_1271 = "));" + NL + "\tdelete ";
  protected final String TEXT_1272 = "[index];" + NL + "    wasRemoved = true;";
  protected final String TEXT_1273 = NL + "    return wasRemoved;" + NL + "  }";
  protected final String TEXT_1274 = NL + "  bool ";
  protected final String TEXT_1275 = "::";
  protected final String TEXT_1276 = "(";
  protected final String TEXT_1277 = "* ";
  protected final String TEXT_1278 = ")" + NL + "  {" + NL + "    bool wasAdded = false;";
  protected final String TEXT_1279 = NL + "    if (";
  protected final String TEXT_1280 = "() >= ";
  protected final String TEXT_1281 = "())" + NL + "    {";
  protected final String TEXT_1282 = NL + "      return wasAdded;" + NL + "    }";
  protected final String TEXT_1283 = NL + "    ";
  protected final String TEXT_1284 = " ";
  protected final String TEXT_1285 = " = ";
  protected final String TEXT_1286 = "->";
  protected final String TEXT_1287 = "();" + NL + "    if (";
  protected final String TEXT_1288 = " != NULL && ";
  protected final String TEXT_1289 = "->";
  protected final String TEXT_1290 = "() <= ";
  protected final String TEXT_1291 = "())" + NL + "    {";
  protected final String TEXT_1292 = NL + "      return wasAdded;" + NL + "    }" + NL + "    else if (";
  protected final String TEXT_1293 = " != null)" + NL + "    {";
  protected final String TEXT_1294 = NL + "      ";
  protected final String TEXT_1295 = ".";
  protected final String TEXT_1296 = ".erase(find(";
  protected final String TEXT_1297 = ".begin(),";
  protected final String TEXT_1298 = ".end(),";
  protected final String TEXT_1299 = "));" + NL + "    }";
  protected final String TEXT_1300 = NL + "    ";
  protected final String TEXT_1301 = ".push_back(";
  protected final String TEXT_1302 = ");";
  protected final String TEXT_1303 = NL + "    ";
  protected final String TEXT_1304 = "(";
  protected final String TEXT_1305 = ",this);" + NL + "    wasAdded = true;";
  protected final String TEXT_1306 = NL + "    return wasAdded;" + NL + "  }" + NL + "" + NL + "  bool ";
  protected final String TEXT_1307 = "::";
  protected final String TEXT_1308 = "(";
  protected final String TEXT_1309 = "* ";
  protected final String TEXT_1310 = ")" + NL + "  {" + NL + "    bool wasRemoved = false;" + NL + "\tint index = find(";
  protected final String TEXT_1311 = ".begin(), ";
  protected final String TEXT_1312 = ".end(), ";
  protected final String TEXT_1313 = ") - ";
  protected final String TEXT_1314 = ".begin();";
  protected final String TEXT_1315 = NL + "    if ((find(";
  protected final String TEXT_1316 = ".begin(),";
  protected final String TEXT_1317 = ".end(),";
  protected final String TEXT_1318 = ") !=";
  protected final String TEXT_1319 = ".end()) && ";
  protected final String TEXT_1320 = "() > ";
  protected final String TEXT_1321 = "())" + NL + "    {";
  protected final String TEXT_1322 = NL + "      ";
  protected final String TEXT_1323 = ".erase(find(";
  protected final String TEXT_1324 = ".begin(),";
  protected final String TEXT_1325 = ".end(),";
  protected final String TEXT_1326 = "));";
  protected final String TEXT_1327 = NL + "      ";
  protected final String TEXT_1328 = "(";
  protected final String TEXT_1329 = ",NULL);" + NL + "\t  delete ";
  protected final String TEXT_1330 = "[index];" + NL + "      wasRemoved = true;" + NL + "    }";
  protected final String TEXT_1331 = NL + "    return wasRemoved;" + NL + "  }";
  protected final String TEXT_1332 = NL + "  bool ";
  protected final String TEXT_1333 = "::";
  protected final String TEXT_1334 = "(";
  protected final String TEXT_1335 = "... ";
  protected final String TEXT_1336 = ")" + NL + "  {" + NL + "    bool wasSet = false;";
  protected final String TEXT_1337 = NL + "    vector<";
  protected final String TEXT_1338 = "*> ";
  protected final String TEXT_1339 = ";" + NL + "\t" + NL + "    for (";
  protected final String TEXT_1340 = " ";
  protected final String TEXT_1341 = " : ";
  protected final String TEXT_1342 = ")" + NL + "    {" + NL + "      if (find(";
  protected final String TEXT_1343 = ".begin(),";
  protected final String TEXT_1344 = ".end(),";
  protected final String TEXT_1345 = ") != ";
  protected final String TEXT_1346 = ".end())" + NL + "      {";
  protected final String TEXT_1347 = NL + "        return wasSet;" + NL + "      }" + NL + "      else if (";
  protected final String TEXT_1348 = ".";
  protected final String TEXT_1349 = "() != NULL && this!=(";
  protected final String TEXT_1350 = "->";
  protected final String TEXT_1351 = "()))" + NL + "      {";
  protected final String TEXT_1352 = NL + "        return wasSet;" + NL + "      }";
  protected final String TEXT_1353 = NL + "      ";
  protected final String TEXT_1354 = ".push_back(";
  protected final String TEXT_1355 = ");" + NL + "    }" + NL + "" + NL + "    if (";
  protected final String TEXT_1356 = ".size() != ";
  protected final String TEXT_1357 = "())" + NL + "    {";
  protected final String TEXT_1358 = NL + "      return wasSet;" + NL + "    }" + NL;
  protected final String TEXT_1359 = NL + "    ";
  protected final String TEXT_1360 = ".removeAll(";
  protected final String TEXT_1361 = ");" + NL + "    " + NL + "    for (";
  protected final String TEXT_1362 = " orphan : ";
  protected final String TEXT_1363 = ")" + NL + "    {";
  protected final String TEXT_1364 = NL + "      ";
  protected final String TEXT_1365 = "(orphan, null);" + NL + "    }";
  protected final String TEXT_1366 = NL + "    ";
  protected final String TEXT_1367 = ".clear();" + NL + "    for (";
  protected final String TEXT_1368 = " ";
  protected final String TEXT_1369 = " : ";
  protected final String TEXT_1370 = ")" + NL + "    {";
  protected final String TEXT_1371 = NL + "      ";
  protected final String TEXT_1372 = "(";
  protected final String TEXT_1373 = ", this);";
  protected final String TEXT_1374 = NL + "      ";
  protected final String TEXT_1375 = ".push_back(";
  protected final String TEXT_1376 = ");" + NL + "    }" + NL + "    wasSet = true;";
  protected final String TEXT_1377 = NL + "    return wasSet;" + NL + "  }" + NL;
  protected final String TEXT_1378 = NL + "  void ";
  protected final String TEXT_1379 = "::";
  protected final String TEXT_1380 = "(";
  protected final String TEXT_1381 = " ";
  protected final String TEXT_1382 = ", ";
  protected final String TEXT_1383 = " ";
  protected final String TEXT_1384 = ")" + NL + "  {" + NL + "    try" + NL + "    {" + NL + "      java.lang.reflect.Field mentorField = ";
  protected final String TEXT_1385 = ".getClass().getDeclaredField(\"";
  protected final String TEXT_1386 = "\");" + NL + "      mentorField.setAccessible(true);" + NL + "      mentorField.set(";
  protected final String TEXT_1387 = ", ";
  protected final String TEXT_1388 = ");" + NL + "    }" + NL + "    catch (Exception e)" + NL + "    {" + NL + "      throw new RuntimeException(\"Issue internally setting ";
  protected final String TEXT_1389 = " to ";
  protected final String TEXT_1390 = "\", e);" + NL + "    }" + NL + "  }" + NL;
  protected final String TEXT_1391 = NL + "  bool ";
  protected final String TEXT_1392 = "::";
  protected final String TEXT_1393 = "(";
  protected final String TEXT_1394 = " ";
  protected final String TEXT_1395 = ")" + NL + "  {" + NL + "    bool wasAdded = false;";
  protected final String TEXT_1396 = NL + "    ";
  protected final String TEXT_1397 = ".push_back(";
  protected final String TEXT_1398 = ");" + NL + "    wasAdded = true;";
  protected final String TEXT_1399 = NL + "    return wasAdded;" + NL + "  }" + NL + "" + NL + "  bool ";
  protected final String TEXT_1400 = "::";
  protected final String TEXT_1401 = "(";
  protected final String TEXT_1402 = "* ";
  protected final String TEXT_1403 = ")" + NL + "  {" + NL + "    bool wasRemoved = false;" + NL + "\tint index = find(";
  protected final String TEXT_1404 = ".begin(), ";
  protected final String TEXT_1405 = ".end(), ";
  protected final String TEXT_1406 = ") - ";
  protected final String TEXT_1407 = ".begin();";
  protected final String TEXT_1408 = NL + "    if (find(";
  protected final String TEXT_1409 = ".begin(),";
  protected final String TEXT_1410 = ".end(),";
  protected final String TEXT_1411 = ") != ";
  protected final String TEXT_1412 = ".end())" + NL + "    {";
  protected final String TEXT_1413 = NL + "      ";
  protected final String TEXT_1414 = ".erase(find(";
  protected final String TEXT_1415 = ".begin(),";
  protected final String TEXT_1416 = ".end(),";
  protected final String TEXT_1417 = "));" + NL + "\t  delete ";
  protected final String TEXT_1418 = "[index];" + NL + "      wasRemoved = true;" + NL + "    }";
  protected final String TEXT_1419 = NL + "    return wasRemoved;" + NL + "  }";
  protected final String TEXT_1420 = NL + "  bool ";
  protected final String TEXT_1421 = "::";
  protected final String TEXT_1422 = "(";
  protected final String TEXT_1423 = "* ";
  protected final String TEXT_1424 = ")" + NL + "  {" + NL + "    bool wasAdded = false;";
  protected final String TEXT_1425 = NL + "    if (";
  protected final String TEXT_1426 = "() < ";
  protected final String TEXT_1427 = "())" + NL + "    {";
  protected final String TEXT_1428 = NL + "      ";
  protected final String TEXT_1429 = ".push_back(";
  protected final String TEXT_1430 = ");" + NL + "      wasAdded = true;" + NL + "    }";
  protected final String TEXT_1431 = NL + "    return wasAdded;" + NL + "  }" + NL + "" + NL + "  bool ";
  protected final String TEXT_1432 = "::";
  protected final String TEXT_1433 = "(";
  protected final String TEXT_1434 = "* ";
  protected final String TEXT_1435 = ")" + NL + "  {" + NL + "    bool wasRemoved = false;" + NL + "\tint index = find(";
  protected final String TEXT_1436 = ".begin(), ";
  protected final String TEXT_1437 = ".end(), ";
  protected final String TEXT_1438 = ") - ";
  protected final String TEXT_1439 = ".begin();";
  protected final String TEXT_1440 = NL + "    if (find(";
  protected final String TEXT_1441 = ".begin(),";
  protected final String TEXT_1442 = ".end(),";
  protected final String TEXT_1443 = ") != ";
  protected final String TEXT_1444 = ".end())" + NL + "    {";
  protected final String TEXT_1445 = NL + "      ";
  protected final String TEXT_1446 = ".erase(";
  protected final String TEXT_1447 = ");" + NL + "\t  delete ";
  protected final String TEXT_1448 = "[index];" + NL + "      wasRemoved = true;" + NL + "    }";
  protected final String TEXT_1449 = NL + "    return wasRemoved;" + NL + "  }";
  protected final String TEXT_1450 = NL + "  bool ";
  protected final String TEXT_1451 = "::";
  protected final String TEXT_1452 = "(";
  protected final String TEXT_1453 = "* ";
  protected final String TEXT_1454 = ")" + NL + "  {" + NL + "    bool wasAdded = false;";
  protected final String TEXT_1455 = NL + "    ";
  protected final String TEXT_1456 = ".push_back(";
  protected final String TEXT_1457 = ");" + NL + "    wasAdded = true;";
  protected final String TEXT_1458 = NL + "    return wasAdded;" + NL + "  }" + NL + "" + NL + "  bool ";
  protected final String TEXT_1459 = "::";
  protected final String TEXT_1460 = "(";
  protected final String TEXT_1461 = "* ";
  protected final String TEXT_1462 = ")" + NL + "  {" + NL + "    bool wasRemoved = false;" + NL + "\tint index = find(";
  protected final String TEXT_1463 = ".begin(), ";
  protected final String TEXT_1464 = ".end(), ";
  protected final String TEXT_1465 = ") - ";
  protected final String TEXT_1466 = ".begin();";
  protected final String TEXT_1467 = NL + "    if (!find(";
  protected final String TEXT_1468 = ".begin(),";
  protected final String TEXT_1469 = ".end(),";
  protected final String TEXT_1470 = ") != ";
  protected final String TEXT_1471 = ".end())" + NL + "    {";
  protected final String TEXT_1472 = NL + "      return wasRemoved;" + NL + "    }" + NL + "" + NL + "    if (";
  protected final String TEXT_1473 = "() <= ";
  protected final String TEXT_1474 = "())" + NL + "    {";
  protected final String TEXT_1475 = NL + "      return wasRemoved;" + NL + "    }" + NL;
  protected final String TEXT_1476 = NL + "    ";
  protected final String TEXT_1477 = ".erase(find(";
  protected final String TEXT_1478 = ".begin(),";
  protected final String TEXT_1479 = ".end(),";
  protected final String TEXT_1480 = "));" + NL + "    delete ";
  protected final String TEXT_1481 = "[index];" + NL + "\twasRemoved = true;";
  protected final String TEXT_1482 = NL + "    return wasRemoved;" + NL + "  }";
  protected final String TEXT_1483 = NL + "  bool ";
  protected final String TEXT_1484 = "::";
  protected final String TEXT_1485 = "(";
  protected final String TEXT_1486 = "... ";
  protected final String TEXT_1487 = ")" + NL + "  {" + NL + "    bool wasSet = false;";
  protected final String TEXT_1488 = NL + "    vector<";
  protected final String TEXT_1489 = "*> ";
  protected final String TEXT_1490 = ";" + NL + "    for (";
  protected final String TEXT_1491 = " ";
  protected final String TEXT_1492 = " : ";
  protected final String TEXT_1493 = ")" + NL + "    {" + NL + "      if (find(";
  protected final String TEXT_1494 = ".begin(),";
  protected final String TEXT_1495 = ".end(),";
  protected final String TEXT_1496 = ") != ";
  protected final String TEXT_1497 = ".end())" + NL + "      {" + NL + "        continue;" + NL + "      }";
  protected final String TEXT_1498 = NL + "      ";
  protected final String TEXT_1499 = ".push_back(";
  protected final String TEXT_1500 = ");" + NL + "    }" + NL + "" + NL + "    if (";
  protected final String TEXT_1501 = ".size() != ";
  protected final String TEXT_1502 = ".size() || ";
  protected final String TEXT_1503 = ".size() != ";
  protected final String TEXT_1504 = "())" + NL + "    {";
  protected final String TEXT_1505 = NL + "      return wasSet;" + NL + "    }" + NL;
  protected final String TEXT_1506 = NL + "    ";
  protected final String TEXT_1507 = ".clear();" + NL + "    for (int i=0; i<";
  protected final String TEXT_1508 = ".size(); i++)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1509 = ".push_back(";
  protected final String TEXT_1510 = "[i]);" + NL + "\t}" + NL + "    wasSet = true;";
  protected final String TEXT_1511 = NL + "    return wasSet;" + NL + "  }";
  protected final String TEXT_1512 = NL + "  ";
  protected final String TEXT_1513 = " bool ";
  protected final String TEXT_1514 = "(";
  protected final String TEXT_1515 = "... ";
  protected final String TEXT_1516 = ")" + NL + "  {" + NL + "    bool wasSet = false;";
  protected final String TEXT_1517 = NL + "    vector<";
  protected final String TEXT_1518 = "*> ";
  protected final String TEXT_1519 = ";" + NL + "    for (int i=0 ; i<";
  protected final String TEXT_1520 = ".size() ; i++)" + NL + "    {" + NL + "      if (find(";
  protected final String TEXT_1521 = ".begin(),";
  protected final String TEXT_1522 = ".end(),(";
  protected final String TEXT_1523 = ") != ";
  protected final String TEXT_1524 = ".end())" + NL + "      {" + NL + "        continue;" + NL + "      }";
  protected final String TEXT_1525 = NL + "      ";
  protected final String TEXT_1526 = ".push_back(";
  protected final String TEXT_1527 = ");" + NL + "    }" + NL + "" + NL + "    if (";
  protected final String TEXT_1528 = ".size() != ";
  protected final String TEXT_1529 = ".length)" + NL + "    {";
  protected final String TEXT_1530 = NL + "      return wasSet;" + NL + "    }" + NL;
  protected final String TEXT_1531 = NL + "    ";
  protected final String TEXT_1532 = ".clear();";
  protected final String TEXT_1533 = NL + "    ";
  protected final String TEXT_1534 = ".addAll(";
  protected final String TEXT_1535 = ");" + NL + "    wasSet = true;";
  protected final String TEXT_1536 = NL + "    return wasSet;" + NL + "  }" + NL;
  protected final String TEXT_1537 = NL + "  bool ";
  protected final String TEXT_1538 = "::";
  protected final String TEXT_1539 = "(";
  protected final String TEXT_1540 = "... ";
  protected final String TEXT_1541 = ")" + NL + "  {" + NL + "    bool wasSet = false;";
  protected final String TEXT_1542 = NL + "    vector<";
  protected final String TEXT_1543 = "*> ";
  protected final String TEXT_1544 = ";" + NL + "    for (";
  protected final String TEXT_1545 = " ";
  protected final String TEXT_1546 = " : ";
  protected final String TEXT_1547 = ")" + NL + "    {" + NL + "      if (find(";
  protected final String TEXT_1548 = ".begin(),";
  protected final String TEXT_1549 = ".end(),";
  protected final String TEXT_1550 = ")!= ";
  protected final String TEXT_1551 = ".end())" + NL + "      {" + NL + "        continue;" + NL + "      }";
  protected final String TEXT_1552 = NL + "      ";
  protected final String TEXT_1553 = "push_back(";
  protected final String TEXT_1554 = ");" + NL + "    }" + NL + "" + NL + "    if (";
  protected final String TEXT_1555 = ".size() != ";
  protected final String TEXT_1556 = ".length || ";
  protected final String TEXT_1557 = ".size() < ";
  protected final String TEXT_1558 = "() || ";
  protected final String TEXT_1559 = ".size() > ";
  protected final String TEXT_1560 = "())" + NL + "    {";
  protected final String TEXT_1561 = NL + "      return wasSet;" + NL + "    }" + NL + "" + NL + "    vector<";
  protected final String TEXT_1562 = "*> ";
  protected final String TEXT_1563 = " = new vector<";
  protected final String TEXT_1564 = "*>(";
  protected final String TEXT_1565 = ");";
  protected final String TEXT_1566 = NL + "    ";
  protected final String TEXT_1567 = ".clear();" + NL + "    for (";
  protected final String TEXT_1568 = " ";
  protected final String TEXT_1569 = " : ";
  protected final String TEXT_1570 = ")" + NL + "    {";
  protected final String TEXT_1571 = NL + "      ";
  protected final String TEXT_1572 = ".push_back(";
  protected final String TEXT_1573 = ");" + NL + "      if (find(";
  protected final String TEXT_1574 = ".begin(),";
  protected final String TEXT_1575 = ".end(),";
  protected final String TEXT_1576 = ")!= ";
  protected final String TEXT_1577 = ".end())" + NL + "      {";
  protected final String TEXT_1578 = NL + "        ";
  protected final String TEXT_1579 = ".erase(find(";
  protected final String TEXT_1580 = ".begin(),";
  protected final String TEXT_1581 = ".end(),";
  protected final String TEXT_1582 = "));" + NL + "      }" + NL + "      else" + NL + "      {";
  protected final String TEXT_1583 = NL + "        ";
  protected final String TEXT_1584 = "->";
  protected final String TEXT_1585 = "(this);" + NL + "      }" + NL + "    }" + NL + "" + NL + "    for (";
  protected final String TEXT_1586 = " ";
  protected final String TEXT_1587 = " : ";
  protected final String TEXT_1588 = ")" + NL + "    {";
  protected final String TEXT_1589 = NL + "      ";
  protected final String TEXT_1590 = ".";
  protected final String TEXT_1591 = "(this);" + NL + "    }" + NL + "    wasSet = true;";
  protected final String TEXT_1592 = NL + "    return wasSet;" + NL + "  }";
  protected final String TEXT_1593 = NL + "  bool ";
  protected final String TEXT_1594 = "::";
  protected final String TEXT_1595 = "(";
  protected final String TEXT_1596 = "... ";
  protected final String TEXT_1597 = ")" + NL + "  {" + NL + "    bool wasSet = false;";
  protected final String TEXT_1598 = NL + "    vector<";
  protected final String TEXT_1599 = "*> ";
  protected final String TEXT_1600 = ";" + NL + "\t" + NL + "    for (";
  protected final String TEXT_1601 = " ";
  protected final String TEXT_1602 = " : ";
  protected final String TEXT_1603 = ")" + NL + "    {" + NL + "      if (find(";
  protected final String TEXT_1604 = ".begin(),";
  protected final String TEXT_1605 = ".end(),";
  protected final String TEXT_1606 = ") != ";
  protected final String TEXT_1607 = ".end())" + NL + "      {" + NL + "        continue;" + NL + "      }";
  protected final String TEXT_1608 = NL + "      ";
  protected final String TEXT_1609 = ".push_back(";
  protected final String TEXT_1610 = ");" + NL + "    }" + NL + "" + NL + "    if (";
  protected final String TEXT_1611 = ".size() != ";
  protected final String TEXT_1612 = ".length || ";
  protected final String TEXT_1613 = ".size() < ";
  protected final String TEXT_1614 = "())" + NL + "    {";
  protected final String TEXT_1615 = NL + "      return wasSet;" + NL + "    }" + NL + "" + NL + "    vector<";
  protected final String TEXT_1616 = "*> ";
  protected final String TEXT_1617 = ";";
  protected final String TEXT_1618 = NL + "    ";
  protected final String TEXT_1619 = ".clear();" + NL + "    for (";
  protected final String TEXT_1620 = " ";
  protected final String TEXT_1621 = " : ";
  protected final String TEXT_1622 = ")" + NL + "    {";
  protected final String TEXT_1623 = NL + "      ";
  protected final String TEXT_1624 = ".push_back(";
  protected final String TEXT_1625 = ");" + NL + "      if (find(";
  protected final String TEXT_1626 = ".begin(),";
  protected final String TEXT_1627 = ".end(),";
  protected final String TEXT_1628 = ")) != ";
  protected final String TEXT_1629 = ".end())" + NL + "      {";
  protected final String TEXT_1630 = NL + "        ";
  protected final String TEXT_1631 = ".erase(";
  protected final String TEXT_1632 = ");" + NL + "      }" + NL + "      else" + NL + "      {";
  protected final String TEXT_1633 = NL + "        ";
  protected final String TEXT_1634 = "->";
  protected final String TEXT_1635 = "(this);" + NL + "      }" + NL + "    }" + NL + "" + NL + "    for (";
  protected final String TEXT_1636 = " ";
  protected final String TEXT_1637 = " : ";
  protected final String TEXT_1638 = ")" + NL + "    {";
  protected final String TEXT_1639 = NL + "      ";
  protected final String TEXT_1640 = "->";
  protected final String TEXT_1641 = "(this);" + NL + "    }" + NL + "    wasSet = true;";
  protected final String TEXT_1642 = NL + "    return wasSet;" + NL + "  }";
  protected final String TEXT_1643 = NL + "  bool ";
  protected final String TEXT_1644 = "::";
  protected final String TEXT_1645 = "(";
  protected final String TEXT_1646 = "... ";
  protected final String TEXT_1647 = ")" + NL + "  {" + NL + "    bool wasSet = false;";
  protected final String TEXT_1648 = NL + "    vector<";
  protected final String TEXT_1649 = "*> ";
  protected final String TEXT_1650 = ";" + NL + "    for (";
  protected final String TEXT_1651 = " ";
  protected final String TEXT_1652 = " : ";
  protected final String TEXT_1653 = ")" + NL + "    {" + NL + "      if (find(";
  protected final String TEXT_1654 = ".begin(),";
  protected final String TEXT_1655 = ".end(),";
  protected final String TEXT_1656 = ") != ";
  protected final String TEXT_1657 = ".end())" + NL + "      {" + NL + "        continue;" + NL + "      }";
  protected final String TEXT_1658 = NL + "      ";
  protected final String TEXT_1659 = "->add(";
  protected final String TEXT_1660 = ");" + NL + "    }" + NL + "" + NL + "    if (";
  protected final String TEXT_1661 = ".size() != ";
  protected final String TEXT_1662 = ".size() || ";
  protected final String TEXT_1663 = ".size() < ";
  protected final String TEXT_1664 = "() || ";
  protected final String TEXT_1665 = ".size() > ";
  protected final String TEXT_1666 = "())" + NL + "    {";
  protected final String TEXT_1667 = NL + "      return wasSet;" + NL + "    }" + NL;
  protected final String TEXT_1668 = NL + "    ";
  protected final String TEXT_1669 = ".clear();" + NL + "\tfor (int i=0; i<";
  protected final String TEXT_1670 = ".size(); i++)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1671 = ".push_back(";
  protected final String TEXT_1672 = "[i]);" + NL + "\t}" + NL + "    " + NL + "    wasSet = true;";
  protected final String TEXT_1673 = NL + "    return wasSet;" + NL + "  }";
  protected final String TEXT_1674 = NL + "  bool ";
  protected final String TEXT_1675 = "::";
  protected final String TEXT_1676 = "(";
  protected final String TEXT_1677 = "... ";
  protected final String TEXT_1678 = ")" + NL + "  {" + NL + "    bool wasSet = false;";
  protected final String TEXT_1679 = NL + "    if (";
  protected final String TEXT_1680 = ".length < ";
  protected final String TEXT_1681 = "()";
  protected final String TEXT_1682 = ")" + NL + "    {";
  protected final String TEXT_1683 = NL + "      return wasSet;" + NL + "    }" + NL + "" + NL + "    vector<";
  protected final String TEXT_1684 = "*> ";
  protected final String TEXT_1685 = ";" + NL + "\t" + NL + "    map<";
  protected final String TEXT_1686 = ",int> ";
  protected final String TEXT_1687 = ";" + NL + "    for (";
  protected final String TEXT_1688 = " ";
  protected final String TEXT_1689 = " : ";
  protected final String TEXT_1690 = ")" + NL + "    {" + NL + "      if (find(";
  protected final String TEXT_1691 = ".begin(),";
  protected final String TEXT_1692 = ".end(),";
  protected final String TEXT_1693 = ") != ";
  protected final String TEXT_1694 = ".end())" + NL + "      {";
  protected final String TEXT_1695 = NL + "        return wasSet;" + NL + "      }" + NL + "      else if (";
  protected final String TEXT_1696 = "->";
  protected final String TEXT_1697 = "() != NULL && this!=";
  protected final String TEXT_1698 = "->";
  protected final String TEXT_1699 = "())" + NL + "      {";
  protected final String TEXT_1700 = NL + "        ";
  protected final String TEXT_1701 = "* ";
  protected final String TEXT_1702 = " = ";
  protected final String TEXT_1703 = ".";
  protected final String TEXT_1704 = "();" + NL + "        if (!";
  protected final String TEXT_1705 = ".find(";
  protected final String TEXT_1706 = "))" + NL + "        {";
  protected final String TEXT_1707 = NL + "          ";
  protected final String TEXT_1708 = ".insert(";
  protected final String TEXT_1709 = ", new int(";
  protected final String TEXT_1710 = "->";
  protected final String TEXT_1711 = "()));" + NL + "        }" + NL + "        int currentCount = ";
  protected final String TEXT_1712 = ".find(";
  protected final String TEXT_1713 = ")->firtst;" + NL + "        int nextCount = currentCount - 1;" + NL + "        if (nextCount < ";
  protected final String TEXT_1714 = ")" + NL + "        {";
  protected final String TEXT_1715 = NL + "          return wasSet;" + NL + "        }";
  protected final String TEXT_1716 = NL + "        ";
  protected final String TEXT_1717 = ".insert(";
  protected final String TEXT_1718 = ", new int(nextCount));" + NL + "      }";
  protected final String TEXT_1719 = NL + "      ";
  protected final String TEXT_1720 = ".push_back(";
  protected final String TEXT_1721 = ");" + NL + "    }" + NL;
  protected final String TEXT_1722 = NL + "    ";
  protected final String TEXT_1723 = ".removeAll(";
  protected final String TEXT_1724 = ");" + NL + "" + NL + "    for (";
  protected final String TEXT_1725 = " orphan : ";
  protected final String TEXT_1726 = ")" + NL + "    {";
  protected final String TEXT_1727 = NL + "      ";
  protected final String TEXT_1728 = "(orphan, null);" + NL + "    }";
  protected final String TEXT_1729 = NL + "    ";
  protected final String TEXT_1730 = ".clear();" + NL + "    for (";
  protected final String TEXT_1731 = " ";
  protected final String TEXT_1732 = " : ";
  protected final String TEXT_1733 = ")" + NL + "    {" + NL + "      if (";
  protected final String TEXT_1734 = ".";
  protected final String TEXT_1735 = "() != null)" + NL + "      {";
  protected final String TEXT_1736 = NL + "        ";
  protected final String TEXT_1737 = ".";
  protected final String TEXT_1738 = "()->";
  protected final String TEXT_1739 = ".erase(";
  protected final String TEXT_1740 = ");" + NL + "      }";
  protected final String TEXT_1741 = NL + "      ";
  protected final String TEXT_1742 = "(";
  protected final String TEXT_1743 = ", this);";
  protected final String TEXT_1744 = NL + "      ";
  protected final String TEXT_1745 = ".push_back(";
  protected final String TEXT_1746 = ");" + NL + "    }" + NL + "    wasSet = true;";
  protected final String TEXT_1747 = NL + "    return wasSet;" + NL + "  }" + NL;
  protected final String TEXT_1748 = NL + "  void ";
  protected final String TEXT_1749 = "::";
  protected final String TEXT_1750 = "(";
  protected final String TEXT_1751 = " ";
  protected final String TEXT_1752 = ", ";
  protected final String TEXT_1753 = " ";
  protected final String TEXT_1754 = ")" + NL + "  {" + NL + "    try" + NL + "    {" + NL + "      java.lang.reflect.Field mentorField = ";
  protected final String TEXT_1755 = ".getClass().getDeclaredField(\"";
  protected final String TEXT_1756 = "\");" + NL + "      mentorField.setAccessible(true);" + NL + "      mentorField.set(";
  protected final String TEXT_1757 = ", ";
  protected final String TEXT_1758 = ");" + NL + "    }" + NL + "    catch (Exception e)" + NL + "    {" + NL + "      throw new RuntimeException(\"Issue internally setting ";
  protected final String TEXT_1759 = " to ";
  protected final String TEXT_1760 = "\", e);" + NL + "    }" + NL + "  }" + NL;
  protected final String TEXT_1761 = NL + "  bool ";
  protected final String TEXT_1762 = "::";
  protected final String TEXT_1763 = "(";
  protected final String TEXT_1764 = "... ";
  protected final String TEXT_1765 = ")" + NL + "  {" + NL + "    bool wasSet = false;";
  protected final String TEXT_1766 = NL + "    vector<";
  protected final String TEXT_1767 = "*> ";
  protected final String TEXT_1768 = ";" + NL + "    for (";
  protected final String TEXT_1769 = " ";
  protected final String TEXT_1770 = " : ";
  protected final String TEXT_1771 = ")" + NL + "    {" + NL + "      if (find(";
  protected final String TEXT_1772 = ".begin(),";
  protected final String TEXT_1773 = ".end(),(";
  protected final String TEXT_1774 = ")) - ";
  protected final String TEXT_1775 = ".end())" + NL + "      {" + NL + "        continue;" + NL + "      }";
  protected final String TEXT_1776 = NL + "      ";
  protected final String TEXT_1777 = ".push_back(";
  protected final String TEXT_1778 = ");" + NL + "    }" + NL + "" + NL + "    if (";
  protected final String TEXT_1779 = ".size() != ";
  protected final String TEXT_1780 = ".size() || ";
  protected final String TEXT_1781 = ".size() > ";
  protected final String TEXT_1782 = "())" + NL + "    {";
  protected final String TEXT_1783 = NL + "      return wasSet;" + NL + "    }" + NL;
  protected final String TEXT_1784 = NL + "    ";
  protected final String TEXT_1785 = ".clear();" + NL + "    for (int i=0; i<";
  protected final String TEXT_1786 = ".size(); i++)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1787 = ".push_back(";
  protected final String TEXT_1788 = "[i]);" + NL + "\t}" + NL + "    wasSet = true;";
  protected final String TEXT_1789 = NL + "    return wasSet;" + NL + "  }";
  protected final String TEXT_1790 = NL + "  bool ";
  protected final String TEXT_1791 = "::";
  protected final String TEXT_1792 = "(";
  protected final String TEXT_1793 = "... ";
  protected final String TEXT_1794 = ")" + NL + "  {" + NL + "    bool wasSet = false;";
  protected final String TEXT_1795 = NL + "    vector<";
  protected final String TEXT_1796 = "*> ";
  protected final String TEXT_1797 = ";" + NL + "    for (";
  protected final String TEXT_1798 = " ";
  protected final String TEXT_1799 = " : ";
  protected final String TEXT_1800 = ")" + NL + "    {" + NL + "      if (find(";
  protected final String TEXT_1801 = ".begin(),";
  protected final String TEXT_1802 = ".end(),";
  protected final String TEXT_1803 = ") != ";
  protected final String TEXT_1804 = ".end())" + NL + "      {" + NL + "        continue;" + NL + "      }";
  protected final String TEXT_1805 = NL + "      ";
  protected final String TEXT_1806 = "->add(";
  protected final String TEXT_1807 = ");" + NL + "    }" + NL + "" + NL + "    if (";
  protected final String TEXT_1808 = ".size() != ";
  protected final String TEXT_1809 = ".size() || ";
  protected final String TEXT_1810 = ".size() < ";
  protected final String TEXT_1811 = "())" + NL + "    {";
  protected final String TEXT_1812 = NL + "      return wasSet;" + NL + "    }" + NL;
  protected final String TEXT_1813 = NL + "    ";
  protected final String TEXT_1814 = ".clear();" + NL + "    for (int i=0; i<";
  protected final String TEXT_1815 = ".size(); i++)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1816 = ".push_back(";
  protected final String TEXT_1817 = "[i]);" + NL + "\t}" + NL + "\t" + NL + "    wasSet = true;";
  protected final String TEXT_1818 = NL + "    return wasSet;" + NL + "  }";
  protected final String TEXT_1819 = NL + "  bool equals(Object obj)" + NL + "  {" + NL + "    if (obj == NULL) { return false; }" + NL + "    if (getClass() != obj.getClass()) { return false; }" + NL;
  protected final String TEXT_1820 = NL + "    ";
  protected final String TEXT_1821 = " == (";
  protected final String TEXT_1822 = ")obj;" + NL + "  " + NL + "    return true;" + NL + "  }" + NL + "" + NL + " int hashCode()" + NL + "  {" + NL + "    if (cachedHashCode != -1)" + NL + "    {" + NL + "      return cachedHashCode;" + NL + "    }" + NL + "    cachedHashCode = 17;";
  protected final String TEXT_1823 = NL + "    ";
  protected final String TEXT_1824 = NL;
  protected final String TEXT_1825 = NL + "    ";
  protected final String TEXT_1826 = NL + "    return cachedHashCode;" + NL + "  }" + NL;
  protected final String TEXT_1827 = NL + "   void ";
  protected final String TEXT_1828 = "::";
  protected final String TEXT_1829 = "()" + NL + "  {" + NL + "     try" + NL + "     {";
  protected final String TEXT_1830 = NL + "       ";
  protected final String TEXT_1831 = NL + "     }" + NL + "     catch (InterruptedException e)" + NL + "     {" + NL + " " + NL + "     }" + NL + "  }" + NL;
  protected final String TEXT_1832 = NL + "  private static class DoActivityThread extends Thread" + NL + "  {";
  protected final String TEXT_1833 = NL + "    ";
  protected final String TEXT_1834 = " controller;" + NL + "    String doActivityMethodName;" + NL + "    " + NL + "    public DoActivityThread(";
  protected final String TEXT_1835 = " aController,String aDoActivityMethodName)" + NL + "    {" + NL + "      controller = aController;" + NL + "      doActivityMethodName = aDoActivityMethodName;" + NL + "      start();" + NL + "    }" + NL + "    " + NL + "    public void run()" + NL + "    {";
  protected final String TEXT_1836 = NL + "      ";
  protected final String TEXT_1837 = NL + "    }" + NL + "  }" + NL;
  protected final String TEXT_1838 = NL + "  void ";
  protected final String TEXT_1839 = "::";
  protected final String TEXT_1840 = "()" + NL + "  {";
  protected final String TEXT_1841 = NL + "    ";
  protected final String TEXT_1842 = " = new TimedEventHandler(this,\"";
  protected final String TEXT_1843 = "\",";
  protected final String TEXT_1844 = ");" + NL + "  }" + NL + "" + NL + "  void ";
  protected final String TEXT_1845 = "::";
  protected final String TEXT_1846 = "()" + NL + "  {";
  protected final String TEXT_1847 = NL + "    ";
  protected final String TEXT_1848 = ".stop();" + NL + "  }" + NL;
  protected final String TEXT_1849 = NL + "  public static class TimedEventHandler extends TimerTask  " + NL + "  {" + NL + "    private ";
  protected final String TEXT_1850 = " controller;" + NL + "    private String timeoutMethodName;" + NL + "    private double howLongInSeconds;" + NL + "    private Timer timer;" + NL + "    " + NL + "    public TimedEventHandler(";
  protected final String TEXT_1851 = " aController, String aTimeoutMethodName, double aHowLongInSeconds)" + NL + "    {" + NL + "      controller = aController;" + NL + "      timeoutMethodName = aTimeoutMethodName;" + NL + "      howLongInSeconds = aHowLongInSeconds;" + NL + "      timer = new Timer();" + NL + "      timer.schedule(this, (long)howLongInSeconds*1000);" + NL + "    }" + NL + "    " + NL + "    public void ";
  protected final String TEXT_1852 = "::stop()" + NL + "    {" + NL + "      timer.cancel();" + NL + "    }" + NL + "    " + NL + "    public void ";
  protected final String TEXT_1853 = "::run ()" + NL + "    {";
  protected final String TEXT_1854 = NL + "      if (\"";
  protected final String TEXT_1855 = "\" == timeoutMethodName)" + NL + "      {" + NL + "        boolean shouldRestart = !controller.";
  protected final String TEXT_1856 = "();" + NL + "        if (shouldRestart)" + NL + "        {" + NL + "          controller.";
  protected final String TEXT_1857 = "();" + NL + "        }" + NL + "        return;" + NL + "      }";
  protected final String TEXT_1858 = NL + "    }" + NL + "  }" + NL;
  protected final String TEXT_1859 = NL + "  " + NL + "  //------------------------" + NL + "  // DESTRUCTOR" + NL + "  //------------------------" + NL + "  ";
  protected final String TEXT_1860 = NL + "    ";
  protected final String TEXT_1861 = " = NULL;" + NL + "    delete ";
  protected final String TEXT_1862 = ";";
  protected final String TEXT_1863 = NL + "    ";
  protected final String TEXT_1864 = ".clear();";
  protected final String TEXT_1865 = NL + "    ";
  protected final String TEXT_1866 = " ";
  protected final String TEXT_1867 = " = ";
  protected final String TEXT_1868 = ";";
  protected final String TEXT_1869 = NL + "    ";
  protected final String TEXT_1870 = " = NULL;" + NL + "    if (";
  protected final String TEXT_1871 = " != NULL)" + NL + "    {" + NL + "      delete ";
  protected final String TEXT_1872 = ";" + NL + "    }";
  protected final String TEXT_1873 = NL + "    if (";
  protected final String TEXT_1874 = " != NULL)" + NL + "    {";
  protected final String TEXT_1875 = NL + "      ";
  protected final String TEXT_1876 = "->";
  protected final String TEXT_1877 = "(NULL);" + NL + "    }";
  protected final String TEXT_1878 = NL + "    ";
  protected final String TEXT_1879 = " ";
  protected final String TEXT_1880 = " = ";
  protected final String TEXT_1881 = ";";
  protected final String TEXT_1882 = NL + "    ";
  protected final String TEXT_1883 = " = NULL;" + NL + "    if (";
  protected final String TEXT_1884 = " != NULL)" + NL + "    {";
  protected final String TEXT_1885 = NL + "      ";
  protected final String TEXT_1886 = "->";
  protected final String TEXT_1887 = "(NULL);" + NL + "    }";
  protected final String TEXT_1888 = NL + "    ";
  protected final String TEXT_1889 = "* ";
  protected final String TEXT_1890 = " = ";
  protected final String TEXT_1891 = ";";
  protected final String TEXT_1892 = NL + "    ";
  protected final String TEXT_1893 = " = NULL;" + NL + "    if (";
  protected final String TEXT_1894 = " != NULL)" + NL + "    {" + NL + "      delete ";
  protected final String TEXT_1895 = ";" + NL + "    }";
  protected final String TEXT_1896 = NL + "    if (";
  protected final String TEXT_1897 = " != NULL)" + NL + "    {";
  protected final String TEXT_1898 = NL + "      ";
  protected final String TEXT_1899 = "* ";
  protected final String TEXT_1900 = " = ";
  protected final String TEXT_1901 = ";" + NL + "      this->";
  protected final String TEXT_1902 = " = NULL;";
  protected final String TEXT_1903 = NL + "      ";
  protected final String TEXT_1904 = "->";
  protected final String TEXT_1905 = "(this);" + NL + "    }" + NL;
  protected final String TEXT_1906 = NL + "    if (";
  protected final String TEXT_1907 = " != NULL)" + NL + "    {" + NL + "      delete ";
  protected final String TEXT_1908 = ";" + NL + "    }";
  protected final String TEXT_1909 = NL + "    if (";
  protected final String TEXT_1910 = " != NULL)" + NL + "    {" + NL + "      if (";
  protected final String TEXT_1911 = ".";
  protected final String TEXT_1912 = "() <= ";
  protected final String TEXT_1913 = ")" + NL + "      {" + NL + "        delete ";
  protected final String TEXT_1914 = ";" + NL + "      }" + NL + "      else" + NL + "      {";
  protected final String TEXT_1915 = NL + "        ";
  protected final String TEXT_1916 = "* ";
  protected final String TEXT_1917 = " = ";
  protected final String TEXT_1918 = ";" + NL + "        this.";
  protected final String TEXT_1919 = " = NULL;";
  protected final String TEXT_1920 = NL + "        ";
  protected final String TEXT_1921 = "->";
  protected final String TEXT_1922 = "(this);" + NL + "      }" + NL + "    }";
  protected final String TEXT_1923 = NL + "    ";
  protected final String TEXT_1924 = " ";
  protected final String TEXT_1925 = " = ";
  protected final String TEXT_1926 = ";" + NL + "    this->";
  protected final String TEXT_1927 = " = NULL;";
  protected final String TEXT_1928 = NL + "    ";
  protected final String TEXT_1929 = "->";
  protected final String TEXT_1930 = "(this);";
  protected final String TEXT_1931 = NL + "    for(i =0; sizeof(";
  protected final String TEXT_1932 = "); i++)" + NL + "    {";
  protected final String TEXT_1933 = NL + "      ";
  protected final String TEXT_1934 = "(";
  protected final String TEXT_1935 = "[i],NULL);" + NL + "    }";
  protected final String TEXT_1936 = NL + "    ";
  protected final String TEXT_1937 = ".clear();";
  protected final String TEXT_1938 = NL + "    vector<";
  protected final String TEXT_1939 = "*> ";
  protected final String TEXT_1940 = " = ";
  protected final String TEXT_1941 = ";";
  protected final String TEXT_1942 = NL + "    ";
  protected final String TEXT_1943 = ".clear();" + NL + "    for(i =0; sizeof(";
  protected final String TEXT_1944 = "); i++)" + NL + "     {" + NL + "      if (";
  protected final String TEXT_1945 = ".";
  protected final String TEXT_1946 = "() <= ";
  protected final String TEXT_1947 = "->";
  protected final String TEXT_1948 = "())" + NL + "      {" + NL + "        delete ";
  protected final String TEXT_1949 = "[i];" + NL + "      }" + NL + "      else" + NL + "      {";
  protected final String TEXT_1950 = NL + "        ";
  protected final String TEXT_1951 = "->";
  protected final String TEXT_1952 = "(this);" + NL + "      }" + NL + "    }";
  protected final String TEXT_1953 = NL + "    vector<";
  protected final String TEXT_1954 = "*> ";
  protected final String TEXT_1955 = " = ";
  protected final String TEXT_1956 = ";";
  protected final String TEXT_1957 = NL + "    ";
  protected final String TEXT_1958 = ".clear();" + NL + "    for(i=0;sizeof(";
  protected final String TEXT_1959 = ");i++)" + NL + "    {";
  protected final String TEXT_1960 = NL + "      ";
  protected final String TEXT_1961 = "[i]->";
  protected final String TEXT_1962 = "(this);" + NL + "    }";
  protected final String TEXT_1963 = NL + "    for(i =0; sizeof(";
  protected final String TEXT_1964 = "); i++)" + NL + "    {" + NL + "      delete ";
  protected final String TEXT_1965 = "[i];" + NL + "    }";
  protected final String TEXT_1966 = NL + "    for(i =0; sizeof(";
  protected final String TEXT_1967 = "); i++)" + NL + "    {";
  protected final String TEXT_1968 = NL + "      ";
  protected final String TEXT_1969 = "[i]->";
  protected final String TEXT_1970 = "(NULL);" + NL + "    }";
  protected final String TEXT_1971 = NL + "  //------------------------" + NL + "  // DEVELOPER CODE - PROVIDED AS-IS" + NL + "  //------------------------" + NL + "   ";
  protected final String TEXT_1972 = NL + "  ";
  protected final String TEXT_1973 = NL;

  // Add a newline to the end of the input
  private void appendln(StringBuffer buffer, String input, Object... variables)
  {
    append(buffer, input + "\n", variables);
  }  

  // This method will be used to append formatted strings
  // i.e. format("Hello {0} {1}", "andrew","forward");
  private void append(StringBuffer buffer, String input, Object... variables)
  {
    buffer.append(StringFormatter.format(input,variables));
  }

  /* 
  * This method will return the generated code.
  */
  public String getCode(UmpleModel model, UmpleElement uElement)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
  UmpleClass uClass = (UmpleClass) uElement;  
  GeneratedClass gClass = uClass.getGeneratedClass();
  CppGenerator gen = new CppGenerator();
  gen.setModel(model);
   
   String curlyBracket = (gen.translate("packageDefinition",uClass) == "")? "" : "}" ; 

  HashMap<String,String> codeInjectionMap = new HashMap<String,String>();
  for (CodeInjection inject : uClass.getCodeInjections())
  {
    String operation = StringFormatter.toUnderscore(inject.getOperation());
    String key = inject.getType() + ":" + operation;
    String newCodeToInject = "";
    if (codeInjectionMap.containsKey(key))
    {
      newCodeToInject = StringFormatter.format("{0}\n    {1}",codeInjectionMap.get(key),inject.getCode());
    }
    else
    {
      newCodeToInject = inject.getCode();
    }
    codeInjectionMap.put(key,newCodeToInject);
  }

  boolean isFirst = true;


    stringBuffer.append(TEXT_2);
    
	appendln(stringBuffer, "");
	append(stringBuffer, "#include \"{0}.h\"",uClass.getName()); 
	if (uClass.hasAssociationVariables())
	for (AssociationVariable av : uClass.getAssociationVariables())
	{
	if ( uClass.getName() != av.getRelatedAssociation().getUmpleClass().getName())
	{
		appendln(stringBuffer, "");
		append(stringBuffer, "#include \"{0}.h\"",av.getRelatedAssociation().getUmpleClass().getName()); 
	}
	}

    stringBuffer.append(TEXT_3);
     if (uClass.numberOfComments() > 0) { if (!uClass.getComments().get(0).isInline) {append(stringBuffer, "\n{0}", Comment.format("Multiline",uClass.getComments()));} else {append(stringBuffer, "\n{0}", Comment.format("Slashes",uClass.getComments())); } } 
    stringBuffer.append(TEXT_4);
      if (uClass.getIsSingleton())
  {
    
    
appendln(stringBuffer, "  {0}* {0}::theInstance = NULL //singleton;", uClass.getName());

    
  }
  for(AssociationVariable av : uClass.getAssociationVariables())
  {
  	if(av.isMany())
  	{
  		
    stringBuffer.append(TEXT_5);
    
		break;
  	}
  }
  
    stringBuffer.append(TEXT_6);
    
  boolean isOneToOne = false;
  for (AssociationVariable av : uClass.getAssociationVariables()) 
  {
    AssociationVariable relatedAssocation = av.getRelatedAssociation();
    if (av.isOnlyOne() && relatedAssocation.isOnlyOne() && av.getIsNavigable() && relatedAssocation.getIsNavigable())
    {
      isOneToOne = true;
      break;
    }
  }
  
    

  String customConstructorPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before","constructor"));
  String customConstructorPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after","constructor"));

  appendln(stringBuffer, "");

  String accessibility = uClass.getIsSingleton() ? "private" : "";
  append(stringBuffer," {0}::{0}({1})",new Object[] {uClass.getName(), gClass.getLookup("constructorSignature")});

  String extraNote = null;
  
  appendln(stringBuffer, "");
  
  boolean hasBody = false;

  append(stringBuffer, "  {");
  if (!uClass.isRoot() && !"interface".equals(uClass.getExtendsClass().getModifier()))
  {
    appendln(stringBuffer, "");
    append(stringBuffer, "    {1}({0});", gClass.getParentClass().getLookup("constructorSignature_caller"),uClass.getName());
    hasBody = true;
  }
  
  if (customConstructorPrefixCode != null)
  {
    append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customConstructorPrefixCode, "    "));
    hasBody = true;
  }
  
  if (uClass.getKey().isProvided())
  {
    hasBody = true;
    appendln(stringBuffer, "");
    append(stringBuffer, "    cachedHashCode = -1;");
  }
  
  for(String memberId : uClass.getKey().getMembers())
  {
    Attribute av = uClass.getAttribute(memberId);
    AssociationVariable as = uClass.getAssociationVariable(memberId);
    if (av != null && !av.isImmutable())
    {
      hasBody = true;
      appendln(stringBuffer, "");
      append(stringBuffer, "    {0} = true;", gen.translate("attributeCanSet",av));
    }
    else if (as != null)
    {
      hasBody = true;
      appendln(stringBuffer, "");
      append(stringBuffer, "    {0} = true;", gen.translate("associationCanSet",as));
    }
  }   

  for (Attribute av : uClass.getAttributes())
  {
    if (av.getIsAutounique() || av.isConstant() || "theInstance".equals(gen.translate("attributeOne",av)) || av.getIsDerived())
    {
      continue;
    }
    
    if (av.getIsList())
    {
      hasBody = true;
      
    boolean hasAvMany = false;
		for (AssociationVariable av2 : uClass.getAssociationVariables())
		{
			if ( av2.isMany())
			{
				hasAvMany = true;
			}			
		}
		String cDec = (hasAvMany)? "" : "int";
		
    stringBuffer.append(TEXT_7);
    append(stringBuffer,"{0} ",cDec);
    stringBuffer.append(TEXT_8);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_9);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_10);
    
    }
    else if ("defaulted".equals(av.getModifier()))
    {
      hasBody = true;
      
    stringBuffer.append(TEXT_11);
    stringBuffer.append(gen.translate("resetMethod",av));
    stringBuffer.append(TEXT_12);
     
    }
    else if (av.isImmutable() && av.getIsLazy())
    {
      hasBody = true;
      
    stringBuffer.append(TEXT_13);
    stringBuffer.append(gen.translate("attributeCanSet",av));
    stringBuffer.append(TEXT_14);
    
    }
    else if (av.isImmutable())
    {
      hasBody = true;
      
    
  String parameterLookup = av.getValue() == null ? "parameterOne" : "parameterValue";

    stringBuffer.append(TEXT_15);
    stringBuffer.append(gen.translate("attributeOne",av));
    stringBuffer.append(TEXT_16);
    stringBuffer.append(gen.translate(parameterLookup,av));
    stringBuffer.append(TEXT_17);
    stringBuffer.append(TEXT_18);
    stringBuffer.append(gen.translate("attributeCanSet",av));
    stringBuffer.append(TEXT_19);
     
    }
    else
    {
      hasBody = true;
      if(!av.getIsLazy()){
         
    
  String parameterLookup = av.getValue() == null ? "parameterOne" : "parameterValue";

    stringBuffer.append(TEXT_20);
    stringBuffer.append(gen.translate("attributeOne",av));
    stringBuffer.append(TEXT_21);
    stringBuffer.append(gen.translate(parameterLookup,av));
    stringBuffer.append(TEXT_22);
    
      }
      else
      {
         
    
  String parameterLookup = null; // av.getValue() == null ? "parameterOne" : "parameterValue";
  String defaultValue = null;
  
 
  if(av.getValue() == null)
  {
     // Try to assign a null value or 0 value if we recognize
     // one of Umple's built in data types. (http://cruise.site.uottawa.ca/umple/UmpleBuiltinDataTypes.html)

     if(av.getType().equals("String") || av.getType().equals("Date") || av.getType().equals("Time"))
     {
  	   defaultValue = "NULL";
     }
     else if(av.getType().equals("Double") || av.getType().equals("Integer"))
     {
       defaultValue = "0";
     }
     else if(av.getType().equals("Float"))
     {
  	   defaultValue = "0.0f";
     }
     else if(av.getType().equals("Boolean"))
     {
  	   defaultValue = "false";
     }
   else
   {
       defaultValue = gen.translate("parameterValue",av);
   }
  }
  // Only assign a value if we could find a default
  if(defaultValue != null)
  { 
    stringBuffer.append(TEXT_23);
    stringBuffer.append(gen.translate("attributeOne",av));
    stringBuffer.append(TEXT_24);
    stringBuffer.append(defaultValue );
    stringBuffer.append(TEXT_25);
    } 
    
      }
    }
  }

  for (Attribute av : uClass.getAttributes())
  {
    if (av.getIsAutounique())
    {
      hasBody = true;
      
    stringBuffer.append(TEXT_26);
    stringBuffer.append(gen.translate("attributeOne",av));
    stringBuffer.append(TEXT_27);
    stringBuffer.append(gen.translate("parameterNext",av));
    stringBuffer.append(TEXT_28);
    
    }
  }
  
  for (AssociationVariable av : uClass.getAssociationVariables())
  {
  	if (!av.getIsNavigable() || !av.isImmutable())
  	{
  	  continue;
  	}
    append(stringBuffer, "\n    {0} = true;", gen.translate("associationCanSet",av));
  }
  
  for (AssociationVariable av : uClass.getAssociationVariables()) 
  {
    AssociationVariable relatedAssociation = av.getRelatedAssociation();
    
    if (!av.getIsNavigable())
    {
      continue;
    }
    
    if (!relatedAssociation.getIsNavigable())
    {
      if (av.isOnlyOne())
      {
        hasBody = true;
        
    stringBuffer.append(TEXT_29);
    stringBuffer.append(gen.translate("setMethod",av));
    stringBuffer.append(TEXT_30);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_31);
    stringBuffer.append(gen.relatedTranslate("type",av));
    stringBuffer.append(TEXT_32);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_33);
    
      }
      else if (av.isOptionalOne() && av.isImmutable())
      {
        hasBody = true;
        
       
    append(stringBuffer, "\n    {0}({1});", gen.translate("setMethod",av), gen.translate("parameterOne",av));

    
      }
      else if (av.isMandatoryMany())
      {
        hasBody = true;
        
    
  String requiredNumber = "";
  if (av.isN())
  {
    requiredNumber += av.getMultiplicity().getLowerBound();
  }
  else if (av.isStar())
  {
    requiredNumber = StringFormatter.format("at least {0}", av.getMultiplicity().getLowerBound());
  }
  else
  {
    requiredNumber = StringFormatter.format("{0} to {1}", av.getMultiplicity().getLowerBound(), av.getMultiplicity().getUpperBound());
  }
  

    stringBuffer.append(TEXT_34);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_35);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_36);
    stringBuffer.append(gen.translate("didAddMany",av));
    stringBuffer.append(TEXT_37);
    stringBuffer.append(gen.translate("setManyMethod",av));
    stringBuffer.append(TEXT_38);
    stringBuffer.append(gen.translate("parameterAll",av));
    stringBuffer.append(TEXT_39);
    stringBuffer.append(gen.translate("didAddMany",av));
    stringBuffer.append(TEXT_40);
    stringBuffer.append(gen.relatedTranslate("type",av));
    stringBuffer.append(TEXT_41);
    stringBuffer.append(requiredNumber);
    stringBuffer.append(TEXT_42);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_43);
    
      }
      else if (av.isOptionalN() && av.isImmutable())
      {
        hasBody = true;
        
     String requiredNumber = StringFormatter.format("{0}", av.getMultiplicity().getUpperBound()); 
    stringBuffer.append(TEXT_44);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_45);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_46);
    stringBuffer.append(gen.translate("didAddMany",av));
    stringBuffer.append(TEXT_47);
    stringBuffer.append(gen.translate("setManyMethod",av));
    stringBuffer.append(TEXT_48);
    stringBuffer.append(gen.translate("parameterAll",av));
    stringBuffer.append(TEXT_49);
    stringBuffer.append(gen.translate("didAddMany",av));
    stringBuffer.append(TEXT_50);
    stringBuffer.append(gen.relatedTranslate("type",av));
    stringBuffer.append(TEXT_51);
    stringBuffer.append(requiredNumber);
    stringBuffer.append(TEXT_52);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_53);
    
      }
      else if (av.isMany() && av.isImmutable())
      {
      	hasBody = true;
        
    stringBuffer.append(TEXT_54);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_55);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_56);
    stringBuffer.append(gen.translate("didAddMany",av));
    stringBuffer.append(TEXT_57);
    stringBuffer.append(gen.translate("setManyMethod",av));
    stringBuffer.append(TEXT_58);
    stringBuffer.append(gen.translate("parameterAll",av));
    stringBuffer.append(TEXT_59);
    stringBuffer.append(gen.translate("didAddMany",av));
    stringBuffer.append(TEXT_60);
    stringBuffer.append(gen.relatedTranslate("type",av));
    stringBuffer.append(TEXT_61);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_62);
    
      }
      else if (av.isMany())
      {
        hasBody = true;
        
    stringBuffer.append(TEXT_63);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_64);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_65);
    
      }
      continue;
    }
    
    if (av.isOnlyOne() && relatedAssociation.isOnlyOne())
    {
      hasBody = true;
      
    stringBuffer.append(TEXT_66);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_67);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_68);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_69);
    stringBuffer.append(gen.relatedTranslate("type",av));
    stringBuffer.append(TEXT_70);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_71);
    stringBuffer.append(TEXT_72);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_73);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_74);
    
    }
    else if ((av.isMN() || av.isN()) && (relatedAssociation.isMandatory() || relatedAssociation.isOptionalN()))
    {
      hasBody = true;
      
    stringBuffer.append(TEXT_75);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_77);
    
    }
    else
    {
      
    
  if (!av.getIsNavigable())
  {
    continue;
  }

  if (av.isOnlyOne())
  {
    
    stringBuffer.append(TEXT_78);
    stringBuffer.append(gen.translate("didAdd",av));
    stringBuffer.append(TEXT_79);
    stringBuffer.append(gen.translate("setMethod",av));
    stringBuffer.append(TEXT_80);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_81);
    stringBuffer.append(gen.translate("didAdd",av));
    stringBuffer.append(TEXT_82);
    stringBuffer.append(gen.relatedTranslate("associationOne",av));
    stringBuffer.append(TEXT_83);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_84);
    
  }
  else if (av.isOptionalMany())
  {
    stringBuffer.append(TEXT_85);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_86);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_87);
    
  }
  else if (av.isMandatoryMany())
  {
    
    
  String requiredNumber = "";
  if (av.isN())
  {
    requiredNumber += av.getMultiplicity().getLowerBound();
  }
  else if (av.isStar())
  {
    requiredNumber = StringFormatter.format("at least {0}", av.getMultiplicity().getLowerBound());
  }
  else
  {
    requiredNumber = StringFormatter.format("{0} to {1}", av.getMultiplicity().getLowerBound(), av.getMultiplicity().getUpperBound());
  }
  

    stringBuffer.append(TEXT_88);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_89);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_90);
    stringBuffer.append(gen.translate("didAddMany",av));
    stringBuffer.append(TEXT_91);
    stringBuffer.append(gen.translate("setManyMethod",av));
    stringBuffer.append(TEXT_92);
    stringBuffer.append(gen.translate("parameterAll",av));
    stringBuffer.append(TEXT_93);
    stringBuffer.append(gen.translate("didAddMany",av));
    stringBuffer.append(TEXT_94);
    stringBuffer.append(gen.relatedTranslate("type",av));
    stringBuffer.append(TEXT_95);
    stringBuffer.append(requiredNumber);
    stringBuffer.append(TEXT_96);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_97);
    
  }
  else if (av.getMultiplicity().getLowerBound() > 0)
  {
    
    stringBuffer.append(TEXT_98);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_99);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_100);
    stringBuffer.append(TEXT_101);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_102);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_103);
    
  }
  else
  {
    continue;
  }
  hasBody = true;

    
    }
  }
  
  for(StateMachine sm : uClass.getStateMachines())
  {
    State state = sm.getStartState();
    if (state == null)
    {
      continue;
    }
    hasBody = true;
    for (StateMachine nestedSm : sm.getNestedStateMachines())
    {
      
    stringBuffer.append(TEXT_104);
    stringBuffer.append(gen.translate("stateMachineOne",nestedSm));
    stringBuffer.append(TEXT_105);
    stringBuffer.append(gen.translate("setMethod",nestedSm));
    stringBuffer.append(TEXT_106);
    stringBuffer.append(gen.translate("type",nestedSm));
    stringBuffer.append(TEXT_107);
    stringBuffer.append(gen.translate("stateNull",nestedSm));
    stringBuffer.append(TEXT_108);
    
    }
    
    stringBuffer.append(TEXT_109);
    stringBuffer.append(gen.translate("setMethod",sm));
    stringBuffer.append(TEXT_110);
    stringBuffer.append(gen.translate("type",sm));
    stringBuffer.append(TEXT_111);
    stringBuffer.append(gen.translate("stateOne",state));
    stringBuffer.append(TEXT_112);
    
  }
  
  if (customConstructorPostfixCode != null)
  {
    append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customConstructorPostfixCode, "    "));
    hasBody = true;
  }

  if (hasBody)
  {
    appendln(stringBuffer, "");
    append(stringBuffer, "  }");
  }
  else
  {
    append(stringBuffer, "}");
  }

  if (uClass.getIsSingleton())
  {
    appendln(stringBuffer, "");
    
    stringBuffer.append(TEXT_113);
    stringBuffer.append(uClass.getName());
    stringBuffer.append(TEXT_114);
    stringBuffer.append(uClass.getName());
    stringBuffer.append(TEXT_115);
    stringBuffer.append(uClass.getName());
    stringBuffer.append(TEXT_116);
    
  }

    
  if (isOneToOne)
  {
    
    
  
  String signature = gClass.getLookup("constructorSignature_mandatory");
  hasBody = false;

    stringBuffer.append(TEXT_117);
    stringBuffer.append(TEXT_118);
    stringBuffer.append(uClass.getName());
    stringBuffer.append(TEXT_119);
    stringBuffer.append(uClass.getName());
    stringBuffer.append(TEXT_120);
    stringBuffer.append(gen.translate("constructorMandatory",uClass));
    stringBuffer.append(TEXT_121);
    
  if (!uClass.isRoot())
  {
    appendln(stringBuffer, "");
    append(stringBuffer, "    {3}::{0}({1});", gClass.getParentClass().getLookup("constructorSignature_caller"),gClass.getParentClass().getClass().getName(),uClass.getName());
    hasBody = true;
  }
  
  if (customConstructorPrefixCode != null) 
  {
    append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customConstructorPrefixCode, "    "));
    hasBody = true;
  }
  
  for (Attribute av : uClass.getAttributes())
  {
    if (av.getIsAutounique() || av.isConstant() || "theInstance".equals(gen.translate("attributeOne",av)))
    {
      continue;
    }
  
    if (av.getIsList())
    {
      hasBody = true;
      
    boolean hasAvMany = false;
		for (AssociationVariable av2 : uClass.getAssociationVariables())
		{
			if ( av2.isMany())
			{
				hasAvMany = true;
			}			
		}
		String cDec = (hasAvMany)? "" : "int";
		
    stringBuffer.append(TEXT_122);
    append(stringBuffer,"{0} ",cDec);
    stringBuffer.append(TEXT_123);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_124);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_125);
    
    }
    else if (av.getModifier().equals("defaulted"))
    {
      hasBody = true;
      
    stringBuffer.append(TEXT_126);
    stringBuffer.append(gen.translate("resetMethod",av));
    stringBuffer.append(TEXT_127);
     
    }
    else
    {
      hasBody = true;
      
    
  String parameterLookup = av.getValue() == null ? "parameterOne" : "parameterValue";

    stringBuffer.append(TEXT_128);
    stringBuffer.append(gen.translate("attributeOne",av));
    stringBuffer.append(TEXT_129);
    stringBuffer.append(gen.translate(parameterLookup,av));
    stringBuffer.append(TEXT_130);
    
    }
  }

  for (Attribute av : uClass.getAttributes())
  {
    if (av.getIsAutounique())
    {
      hasBody = true;
      
    stringBuffer.append(TEXT_131);
    stringBuffer.append(gen.translate("attributeOne",av));
    stringBuffer.append(TEXT_132);
    stringBuffer.append(gen.translate("parameterNext",av));
    stringBuffer.append(TEXT_133);
    
    }
  }
  
  for (AssociationVariable av : uClass.getAssociationVariables()) 
  {
    AssociationVariable relatedAssociation = av.getRelatedAssociation();
    
    if (av.isOnlyOne() && relatedAssociation.isOnlyOne())
    {
      hasBody = true;
      
    stringBuffer.append(TEXT_134);
    
    }
    else if ((av.isMN() || av.isN()) && (relatedAssociation.isMandatory() || relatedAssociation.isOptionalN()))
    {
      hasBody = true;
      
    stringBuffer.append(TEXT_135);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_136);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_137);
    
    }
    else
    {
      hasBody = true;
      
    
  if (!av.getIsNavigable())
  {
    continue;
  }

  if (av.isOnlyOne())
  {
    
    stringBuffer.append(TEXT_138);
    stringBuffer.append(gen.translate("didAdd",av));
    stringBuffer.append(TEXT_139);
    stringBuffer.append(gen.translate("setMethod",av));
    stringBuffer.append(TEXT_140);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_141);
    stringBuffer.append(gen.translate("didAdd",av));
    stringBuffer.append(TEXT_142);
    stringBuffer.append(gen.relatedTranslate("associationOne",av));
    stringBuffer.append(TEXT_143);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_144);
    
  }
  else if (av.isOptionalMany())
  {
    stringBuffer.append(TEXT_145);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_146);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_147);
    
  }
  else if (av.isMandatoryMany())
  {
    
    
  String requiredNumber = "";
  if (av.isN())
  {
    requiredNumber += av.getMultiplicity().getLowerBound();
  }
  else if (av.isStar())
  {
    requiredNumber = StringFormatter.format("at least {0}", av.getMultiplicity().getLowerBound());
  }
  else
  {
    requiredNumber = StringFormatter.format("{0} to {1}", av.getMultiplicity().getLowerBound(), av.getMultiplicity().getUpperBound());
  }
  

    stringBuffer.append(TEXT_148);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_149);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_150);
    stringBuffer.append(gen.translate("didAddMany",av));
    stringBuffer.append(TEXT_151);
    stringBuffer.append(gen.translate("setManyMethod",av));
    stringBuffer.append(TEXT_152);
    stringBuffer.append(gen.translate("parameterAll",av));
    stringBuffer.append(TEXT_153);
    stringBuffer.append(gen.translate("didAddMany",av));
    stringBuffer.append(TEXT_154);
    stringBuffer.append(gen.relatedTranslate("type",av));
    stringBuffer.append(TEXT_155);
    stringBuffer.append(requiredNumber);
    stringBuffer.append(TEXT_156);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_157);
    
  }
  else if (av.getMultiplicity().getLowerBound() > 0)
  {
    
    stringBuffer.append(TEXT_158);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_159);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_160);
    stringBuffer.append(TEXT_161);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_162);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_163);
    
  }
  else
  {
    continue;
  }
  hasBody = true;

    
    }
  }
  
  if (customConstructorPostfixCode != null) 
  {
    append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customConstructorPostfixCode, "    "));
    hasBody = true;
  }
  
  if (hasBody)
  {
    appendln(stringBuffer, "");
    append(stringBuffer, "  }");
  }
  else
  {
    append(stringBuffer, "}");
  }
  

    
  }


    stringBuffer.append(TEXT_164);
     if (uClass.getAttributes() != null)
	{
		
  		
    
  
  appendln(stringBuffer, "");
  appendln(stringBuffer, "  //------------------------");
  appendln(stringBuffer, "  // COPY CONSTRUCTOR");
  appendln(stringBuffer, "  //------------------------");
  appendln(stringBuffer, "");
  append(stringBuffer," {0}::{0}(const {0} & {1})",new Object[] {uClass.getName(),uClass.getName().toLowerCase()});

  appendln(stringBuffer, "");
  append(stringBuffer, "  {");
  for (Attribute av : uClass.getAttributes())
  {
  	 appendln(stringBuffer, "");
     append(stringBuffer, "    this->{0} = {1}.{0};",av.getName(),uClass.getName().toLowerCase());  
  }
  
  if(uClass.hasAttributes())
  {
  	appendln(stringBuffer, "");
  	append(stringBuffer, "  }");
  }
  else
  {
    append(stringBuffer, "  }");
  }
  


    
  	}
    stringBuffer.append(TEXT_165);
     if (uClass.getAttributes() != null)
	{
		
  		
    
  
  appendln(stringBuffer, "");
  appendln(stringBuffer, "  //------------------------");
  appendln(stringBuffer, "  // Operator =");
  appendln(stringBuffer, "  //------------------------");
  appendln(stringBuffer, "");
  appendln(stringBuffer," {0} {0}::operator=(const {0} & {1})",new Object[] {uClass.getName(),uClass.getName().toLowerCase()});
  append(stringBuffer, "  {");
  for (Attribute av : uClass.getAttributes())
  {
  	 appendln(stringBuffer, "");
  	 append(stringBuffer, "    this->{0} = {1}.{0};",av.getName(),uClass.getName().toLowerCase());  
  }
  if(uClass.hasAttributes())
  {
  	appendln(stringBuffer, "");
  	append(stringBuffer, "  }");
  }
  else
  {
    append(stringBuffer, "  }");
  }
  


    
  	}
    stringBuffer.append(TEXT_166);
    
  // GENERIC FILE - EDIT IN UmpleToTemplate project, then run "ant -f build.codegen.xml to move into the appropriate projects
  for (Attribute av : uClass.getAttributes())
  {
  
    if (av.isConstant() || av.getIsAutounique() || "internal".equals(av.getModifier()) || av.getIsDerived())
    {
      continue;
    }

    String customSetPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("setMethod",av)));
    String customSetPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("setMethod",av)));

    String customResetPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("resetMethod",av)));
    String customResetPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("resetMethod",av)));

    String customAddPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("addMethod",av)));
    String customAddPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("addMethod",av)));
  
    String customRemovePrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("removeMethod",av)));
    String customRemovePostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("removeMethod",av)));
    
    if (av.isImmutable())
    {
      if (av.getIsLazy())
      {
        
    stringBuffer.append(TEXT_167);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_168);
    stringBuffer.append(gen.translate("setMethod",av));
    stringBuffer.append(TEXT_169);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_170);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_171);
     if (customSetPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_172);
    stringBuffer.append( gen.translate("attributeCanSet",av) );
    stringBuffer.append(TEXT_173);
    stringBuffer.append(TEXT_174);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_175);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_176);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_177);
    
      }
    }
    else if (av.getModifier().equals("defaulted"))
    {
      
    stringBuffer.append(TEXT_178);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_179);
    stringBuffer.append(gen.translate("setMethod",av));
    stringBuffer.append(TEXT_180);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_181);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_182);
     if (customSetPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_183);
    stringBuffer.append(gen.translate("attributeOne",av));
    stringBuffer.append(TEXT_184);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_185);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_186);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_187);
    stringBuffer.append(gen.translate("resetMethod",av));
    stringBuffer.append(TEXT_188);
     if (customResetPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customResetPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_189);
    stringBuffer.append(gen.translate("attributeOne",av));
    stringBuffer.append(TEXT_190);
    stringBuffer.append(gen.translate("getDefaultMethod",av));
    stringBuffer.append(TEXT_191);
     if (customResetPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customResetPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_192);
    
    }
    else if (av.getIsList())
    {
      
    stringBuffer.append(TEXT_193);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_194);
    stringBuffer.append(gen.translate("addMethod",av));
    stringBuffer.append(TEXT_195);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_196);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_197);
     if (customAddPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_198);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_199);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_200);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_201);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_202);
    stringBuffer.append(gen.translate("removeMethod",av));
    stringBuffer.append(TEXT_203);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_204);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_205);
     if (customRemovePrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    stringBuffer.append(TEXT_206);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_207);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_208);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    stringBuffer.append(TEXT_209);
    
    }
    else
    {
      
    stringBuffer.append(TEXT_210);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_211);
    stringBuffer.append( gen.translate("setMethod",av) );
    stringBuffer.append(TEXT_212);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_213);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_214);
     if (customSetPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_215);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_216);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_217);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_218);
    
    }
  }

    
  // GENERIC FILE - EDIT IN UmpleToTemplate project, then run "ant -f build.codegen.xml to move into the appropriate projects
  for (Attribute av : uClass.getAttributes()) 
  {
    if (av.getIsAutounique() || av.isConstant() || "internal".equals(av.getModifier()))
    {
      continue;
    }
    
    String customGetPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("getMethod",av)));
    String customGetPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("getMethod",av)));

    String customGetDefaultPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("getDefaultMethod",av)));
    String customGetDefaultPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("getDefaultMethod",av)));

    String customGetManyPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("getManyMethod",av)));
    String customGetManyPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("getManyMethod",av)));

    String customNumberOfPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("numberOfMethod",av)));
    String customNumberOfPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("numberOfMethod",av)));

    String customHasManyPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("hasManyMethod",av)));
    String customHasManyPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("hasManyMethod",av)));

    String customIndexOfPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("indexOfMethod",av)));
    String customIndexOfPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("indexOfMethod",av)));
    
    if (av.getIsList())
    {
      
    stringBuffer.append(TEXT_219);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_220);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_221);
    stringBuffer.append(gen.translate("getMethod",av));
    stringBuffer.append(TEXT_222);
     if (customGetPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_223);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_224);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_225);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_226);
     if (customGetPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_227);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_228);
    stringBuffer.append(TEXT_229);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_230);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_231);
    stringBuffer.append(gen.translate("getManyMethod",av));
    stringBuffer.append(TEXT_232);
     if (customGetManyPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customGetManyPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_233);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_234);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_235);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_236);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_237);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_238);
     if (customGetManyPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customGetManyPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_239);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_240);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_241);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_242);
     if (customNumberOfPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customNumberOfPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_243);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_244);
     if (customNumberOfPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customNumberOfPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_245);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_246);
    stringBuffer.append(gen.translate("hasManyMethod",av));
    stringBuffer.append(TEXT_247);
     if (customHasManyPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customHasManyPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_248);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_249);
     if (customHasManyPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customHasManyPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_250);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_251);
    stringBuffer.append(gen.translate("indexOfMethod",av));
    stringBuffer.append(TEXT_252);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_253);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_254);
     if (customIndexOfPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customIndexOfPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_255);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_256);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_257);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_258);
    stringBuffer.append(gen.translate("attributeMany",av));
    stringBuffer.append(TEXT_259);
     if (customIndexOfPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customIndexOfPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_260);
    
    }
    else 
    {

      if (av.getIsDerived() && customGetPostfixCode != null)
      {
        
    stringBuffer.append(TEXT_261);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_262);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_263);
    stringBuffer.append( gen.translate("getMethod",av) );
    stringBuffer.append(TEXT_264);
     if (customGetPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_265);
    stringBuffer.append( gen.translate("type",av) );
    stringBuffer.append(TEXT_266);
    stringBuffer.append( gen.translate("parameterOne",av) );
    stringBuffer.append(TEXT_267);
    stringBuffer.append( gen.translate("parameterValue",av) );
    stringBuffer.append(TEXT_268);
     if (customGetPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_269);
    stringBuffer.append( gen.translate("parameterOne",av) );
    stringBuffer.append(TEXT_270);
    
      }
      else if (av.getIsDerived())
      {
        
    stringBuffer.append(TEXT_271);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_272);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_273);
    stringBuffer.append( gen.translate("getMethod",av) );
    stringBuffer.append(TEXT_274);
    stringBuffer.append( gen.translate("parameterValue",av) );
    stringBuffer.append(TEXT_275);
    
      }
      else if (customGetPostfixCode != null)
      {
        
    stringBuffer.append(TEXT_276);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_277);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_278);
    stringBuffer.append( gen.translate("getMethod",av) );
    stringBuffer.append(TEXT_279);
     if (customGetPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_280);
    stringBuffer.append( gen.translate("type",av) );
    stringBuffer.append(TEXT_281);
    stringBuffer.append( gen.translate("parameterOne",av) );
    stringBuffer.append(TEXT_282);
    stringBuffer.append(gen.translate("attributeOne",av));
    stringBuffer.append(TEXT_283);
     if (customGetPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_284);
    stringBuffer.append( gen.translate("parameterOne",av) );
    stringBuffer.append(TEXT_285);
    
      }
      else
      {
        
    stringBuffer.append(TEXT_286);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_287);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_288);
    stringBuffer.append( gen.translate("getMethod",av) );
    stringBuffer.append(TEXT_289);
     if (customGetPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_290);
    stringBuffer.append(gen.translate("attributeOne",av));
    stringBuffer.append(TEXT_291);
    
      }
      
      appendln(stringBuffer, "");
      
      if (av.getModifier().equals("defaulted") && customGetDefaultPostfixCode != null)
      {
        
    stringBuffer.append(TEXT_292);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_293);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_294);
    stringBuffer.append(gen.translate("getDefaultMethod",av));
    stringBuffer.append(TEXT_295);
     if (customGetDefaultPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customGetDefaultPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_296);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_297);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_298);
    stringBuffer.append( gen.translate("parameterValue",av) );
    stringBuffer.append(TEXT_299);
     if (customGetDefaultPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customGetDefaultPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_300);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_301);
    
      }
      else if (av.getModifier().equals("defaulted"))
      {
        
    stringBuffer.append(TEXT_302);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_303);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_304);
    stringBuffer.append(gen.translate("getDefaultMethod",av));
    stringBuffer.append(TEXT_305);
     if (customGetDefaultPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customGetDefaultPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_306);
    stringBuffer.append( gen.translate("parameterValue",av) );
    stringBuffer.append(TEXT_307);
    
      }
    }
  }

  for (Attribute av : uClass.getAttributes()) 
  {
  
    if (av.getIsAutounique())
    {
      String customGetPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("getMethod",av)));
      String customGetPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("getMethod",av)));
      
      if (customGetPostfixCode != null)
      {
        
    stringBuffer.append(TEXT_308);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_309);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_310);
    stringBuffer.append( gen.translate("getMethod",av) );
    stringBuffer.append(TEXT_311);
     if (customGetPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_312);
    stringBuffer.append( gen.translate("type",av) );
    stringBuffer.append(TEXT_313);
    stringBuffer.append( gen.translate("parameterOne",av) );
    stringBuffer.append(TEXT_314);
    stringBuffer.append(gen.translate("attributeOne",av));
    stringBuffer.append(TEXT_315);
     if (customGetPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_316);
    stringBuffer.append( gen.translate("parameterOne",av) );
    stringBuffer.append(TEXT_317);
    
      }
      else
      {
        
    stringBuffer.append(TEXT_318);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_319);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_320);
    stringBuffer.append( gen.translate("getMethod",av) );
    stringBuffer.append(TEXT_321);
     if (customGetPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_322);
    stringBuffer.append(gen.translate("attributeOne",av));
    stringBuffer.append(TEXT_323);
    
      }
      appendln(stringBuffer, "");
    }
  }

    
{
  // GENERIC FILE - EDIT IN UmpleToTemplate project, then run "ant -f build.codegen.xml to move into the appropriate projects
  isFirst = true;
  for(StateMachine sm : uClass.getStateMachines())
  {
    
    
  StringBuilder output = new StringBuilder(); 
  List<StateMachine> allParents = new ArrayList<StateMachine>();
  allParents.add(sm);
  while (allParents.size() > 0) 
  {
    StateMachine parentSm = allParents.get(0);
    allParents.remove(0);
    for (StateMachine childSm : parentSm.getNestedStateMachines()) 
    {
      output.append(StringFormatter.format("\n    if ({0} != {1}.Null) { answer += \".\" + {0}.toString(); }",gen.translate("stateMachineOne",childSm),gen.translate("type",childSm)));
      allParents.addAll(childSm.getNestedStateMachines());
    }     
  }
  String outputAsString = output.toString();

    stringBuffer.append(TEXT_324);
    stringBuffer.append(gen.translate("typeFull",sm));
    stringBuffer.append(TEXT_325);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_326);
    stringBuffer.append(gen.translate("getFullMethod",sm));
    stringBuffer.append(TEXT_327);
    stringBuffer.append(gen.translate("stateMachineOne",sm));
    stringBuffer.append(TEXT_328);
     if (outputAsString.length() > 0) { append(stringBuffer, "{0}",outputAsString); } 
    stringBuffer.append(TEXT_329);
     
  }
  
  for(StateMachine sm : uClass.getAllStateMachines())
  {
    
    stringBuffer.append(TEXT_330);
    stringBuffer.append(gen.translate("type",sm));
    stringBuffer.append(TEXT_331);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_332);
    stringBuffer.append(gen.translate("getMethod",sm));
    stringBuffer.append(TEXT_333);
    stringBuffer.append( gen.translate("stateOne",sm) );
    stringBuffer.append(TEXT_334);
    
  }
}

    
{
  // GENERIC FILE - EDIT IN UmpleToTemplate project, then run "ant -f build.codegen.xml to move into the appropriate projects
  for(Event e : uClass.getEvents())
  {
    
    
  StringBuffer allCases = new StringBuffer();

  for(StateMachine sm : uClass.getStateMachines(e))
  {
    allCases.append(StringFormatter.format("    switch ({0})\n",gen.translate("stateMachineOne",sm)));
    allCases.append(StringFormatter.format("    {\n"));
    
    for(State state : sm.getStates())
    {
  
      List<Transition> allT = state.getTransitionsFor(e);
  
      if (allT.size() == 0)
      {
        continue;
      }

      allCases.append(StringFormatter.format("      case {0}:\n",gen.translate("stateOne",state)));

      boolean hasExitAction = false;
      for(Action action : state.getActions())
      {
        if ("exit".equals(action.getActionType()))
        {
          hasExitAction = true;
          break;
        }
      }
  
      boolean needsBreak = true;
      for (Transition t : allT)
      {
        State nextState = t.getNextState();
        String tabSpace = t.getGuard() == null ? "        " : "          ";
        if (t.getGuard() != null)
        {
          allCases.append(StringFormatter.format("        if ({0})\n",t.getGuard().getCondition()));
          allCases.append(StringFormatter.format("        {\n"));
        }
        if (hasExitAction)
        {
          allCases.append(StringFormatter.format("{0}{1}();\n",tabSpace,gen.translate("exitMethod",sm)));
        }
        if (t.getAction() != null)
        {
          Action a1= t.getAction();
          allCases.append(StringFormatter.format("{0}{1}\n",tabSpace,a1.getActionCode()));
        }

        allCases.append(StringFormatter.format("{0}{1}({2}.{3});\n",tabSpace,gen.translate("setMethod",nextState.getStateMachine()),gen.translate("type",nextState.getStateMachine()),gen.translate("stateOne",nextState)));
        allCases.append(StringFormatter.format("{0}wasEventProcessed = true;\n",tabSpace));
        allCases.append(StringFormatter.format("{0}break;\n",tabSpace));

        if (t.getGuard() != null)
        {
          allCases.append(StringFormatter.format("        }\n"));
        }
        else
        {
          needsBreak = false;
          //You can only have one *no guard case*
          break;
        }
      }
  
      if (needsBreak)
      {
        allCases.append(StringFormatter.format("        break;\n"));
      }
    } 
    allCases.append(StringFormatter.format("    }\n\n"));
  }
  
  String scope = e.getIsInternal() || e.isAutoTransition() ? "private " : "";
  String outputCases = allCases.toString().trim();

    stringBuffer.append(TEXT_335);
    stringBuffer.append(scope);
    stringBuffer.append(TEXT_336);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_337);
    stringBuffer.append(gen.translate("eventMethod",e));
    stringBuffer.append(TEXT_338);
    stringBuffer.append(TEXT_339);
    stringBuffer.append( outputCases );
    stringBuffer.append(TEXT_340);
    
  }
}

    
{
  // GENERIC FILE - EDIT IN UmpleToTemplate project, then run "ant -f build.codegen.xml to move into the appropriate projects
  for (StateMachine sm : uClass.getAllStateMachines())  
  {

    if (sm.getType() == "Simple" && sm.numberOfStates() > 0)
    {
      
    stringBuffer.append(TEXT_341);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_342);
    stringBuffer.append(gen.translate("setMethod",sm));
    stringBuffer.append(TEXT_343);
    stringBuffer.append( gen.translate("type",sm) );
    stringBuffer.append(TEXT_344);
    stringBuffer.append( gen.translate("parameterOne",sm) );
    stringBuffer.append(TEXT_345);
    stringBuffer.append(TEXT_346);
    stringBuffer.append( gen.translate("stateMachineOne",sm) );
    stringBuffer.append(TEXT_347);
    stringBuffer.append( gen.translate("parameterOne",sm) );
    stringBuffer.append(TEXT_348);
    
    }
    else if (sm.numberOfStates() > 0)
    {
      
    
  boolean hasEntry = false;
  boolean hasExit = false;
  boolean isFirstEntry = true;
  boolean isFirstExit = true;
  State parentState = sm.getParentState();
  StateMachine parentSm = parentState != null ? parentState.getStateMachine() : null;

  StringBuilder entryActions = new StringBuilder();
  StringBuilder exitActions = new StringBuilder();
  for(State state : sm.getStates())
  {
    boolean hasThisEntry = false;
    boolean hasThisExit = false;
    
    for(Action action : state.getActions())
    {
      if ("entry".equals(action.getActionType()))
      {
        if (!hasThisEntry)
        {
          if (!isFirstEntry)
          {
            entryActions.append("\n      ");
          }
          entryActions.append(StringFormatter.format("case {0}:",gen.translate("stateOne",state)));
        }
        hasEntry = true;
        hasThisEntry = true;
        isFirstEntry = false;
        entryActions.append("\n        " + action.getActionCode());
      }
      else if ("exit".equals(action.getActionType()))
      {
        if (!hasThisExit)
        {
          if (!isFirstExit)
          {
            exitActions.append("\n      ");
          }
          isFirstExit = false;
          exitActions.append(StringFormatter.format("case {0}:",gen.translate("stateOne",state)));
        }
        hasExit = true;
        hasThisExit = true;
        isFirstExit = false;
        exitActions.append("\n        " + action.getActionCode());
      }
    }
  
    if (state.getActivity() != null)
    {
      if (!hasThisEntry)
      {
        if (!isFirstEntry)
        {
          entryActions.append("\n      ");
        }
        entryActions.append(StringFormatter.format("case {0}:",gen.translate("stateOne",state)));
      }
      hasEntry = true;
      hasThisEntry = true;
      isFirstEntry = false;
      entryActions.append(StringFormatter.format("\n        {1} = new DoActivityThread(this,\"{0}\");",gen.translate("doActivityMethod",state),gen.translate("doActivityThread",state)));
    }
    
    if (hasThisEntry)
    {
      entryActions.append("\n        break;");
    }
    
    if (hasThisExit)
    {
      exitActions.append("\n        break;");
    }
  }

     if (hasExit) { 
    stringBuffer.append(TEXT_349);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_350);
    stringBuffer.append(gen.translate("exitMethod",sm));
    stringBuffer.append(TEXT_351);
    stringBuffer.append( gen.translate("stateMachineOne",sm) );
    stringBuffer.append(TEXT_352);
    stringBuffer.append(TEXT_353);
    stringBuffer.append( exitActions );
    stringBuffer.append(TEXT_354);
     } 
    stringBuffer.append(TEXT_355);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_356);
    stringBuffer.append(gen.translate("setMethod",sm));
    stringBuffer.append(TEXT_357);
    stringBuffer.append( gen.translate("type",sm) );
    stringBuffer.append(TEXT_358);
    stringBuffer.append( gen.translate("parameterOne",sm) );
    stringBuffer.append(TEXT_359);
    stringBuffer.append(TEXT_360);
    stringBuffer.append( gen.translate("stateMachineOne",sm) );
    stringBuffer.append(TEXT_361);
    stringBuffer.append( gen.translate("parameterOne",sm) );
    stringBuffer.append(TEXT_362);
     if (parentState != null) { 
    stringBuffer.append(TEXT_363);
    stringBuffer.append( gen.translate("stateMachineOne",parentSm) );
    stringBuffer.append(TEXT_364);
    stringBuffer.append( gen.translate("type",parentSm) );
    stringBuffer.append(TEXT_365);
    stringBuffer.append( gen.translate("stateOne",parentState) );
    stringBuffer.append(TEXT_366);
    stringBuffer.append( gen.translate("parameterOne",sm) );
    stringBuffer.append(TEXT_367);
    stringBuffer.append( gen.translate("type",sm) );
    stringBuffer.append(TEXT_368);
    stringBuffer.append( gen.translate("stateNull",sm) );
    stringBuffer.append(TEXT_369);
    stringBuffer.append(gen.translate("setMethod",parentSm));
    stringBuffer.append(TEXT_370);
    stringBuffer.append( gen.translate("type",parentSm) );
    stringBuffer.append(TEXT_371);
    stringBuffer.append( gen.translate("stateOne",parentState) );
    stringBuffer.append(TEXT_372);
     } 
     if (hasEntry) { 
    stringBuffer.append(TEXT_373);
    stringBuffer.append( gen.translate("stateMachineOne",sm) );
    stringBuffer.append(TEXT_374);
    stringBuffer.append(TEXT_375);
    stringBuffer.append( entryActions );
    stringBuffer.append(TEXT_376);
     } 
    stringBuffer.append(TEXT_377);
    
    }
  }
}

    
  // GENERIC FILE - EDIT IN UmpleToTemplate project, then run "ant -f build.codegen.xml to move into the appropriate projects
  for (AssociationVariable av : uClass.getAssociationVariables()) 
  {

    if (!av.getIsNavigable())
    {
      continue;
    }

    String customGetPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("getMethod",av)));
    String customGetPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("getMethod",av)));

    String customGetDefaultPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("getDefaultMethod",av)));
    String customGetDefaultPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("getDefaultMethod",av)));

    String customGetManyPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("getManyMethod",av)));
    String customGetManyPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("getManyMethod",av)));

    String customNumberOfPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("numberOfMethod",av)));
    String customNumberOfPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("numberOfMethod",av)));

    String customHasManyPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("hasManyMethod",av)));
    String customHasManyPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("hasManyMethod",av)));

    String customIndexOfPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("indexOfMethod",av)));
    String customIndexOfPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("indexOfMethod",av)));

    boolean hasCodeInjections = customGetPrefixCode != null || customGetPostfixCode != null;
  
    if (av.isOne())
    {
      
    stringBuffer.append(TEXT_378);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_379);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_380);
    stringBuffer.append(gen.translate("getMethod",av));
    stringBuffer.append(TEXT_381);
     if (customGetPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
     if (customGetPostfixCode == null) { 
    stringBuffer.append(TEXT_382);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_383);
     } else { 
    stringBuffer.append(TEXT_384);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_385);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_386);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_387);
     append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); 
    stringBuffer.append(TEXT_388);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_389);
     } 
    stringBuffer.append(TEXT_390);
    
    }
    else if (av.isMany())
    {
      
    stringBuffer.append(TEXT_391);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_392);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_393);
    stringBuffer.append(gen.translate("getMethod",av));
    stringBuffer.append(TEXT_394);
     if (customGetPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customGetPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_395);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_396);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_397);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_398);
     if (customGetPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customGetPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_399);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_400);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_401);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_402);
    stringBuffer.append(gen.translate("getManyMethod",av));
    stringBuffer.append(TEXT_403);
     if (customGetManyPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customGetManyPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_404);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_405);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_406);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_407);
     if (customGetManyPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customGetManyPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_408);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_409);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_410);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_411);
     if (customNumberOfPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customNumberOfPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_412);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_413);
     if (customNumberOfPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customNumberOfPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_414);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_415);
    stringBuffer.append(gen.translate("hasManyMethod",av));
    stringBuffer.append(TEXT_416);
     if (customHasManyPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customHasManyPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_417);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_418);
     if (customHasManyPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customHasManyPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_419);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_420);
    stringBuffer.append(gen.translate("indexOfMethod",av));
    stringBuffer.append(TEXT_421);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_422);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_423);
     if (customIndexOfPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customIndexOfPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_424);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_425);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_426);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_427);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_428);
     if (customIndexOfPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customIndexOfPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_429);
    
    }
    else
    {
      
    stringBuffer.append(TEXT_430);
    
    }
 }

    
  // GENERIC FILE - EDIT IN UmpleToTemplate project, then run "ant -f build.codegen.xml to move into the appropriate projects
  for (AssociationVariable av : uClass.getAssociationVariables())
  {
  
    AssociationVariable relatedAssociation = av.getRelatedAssociation();

    if (!av.getIsNavigable())
    {
      continue;
    } 

    String customSetPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("setMethod",av)));
    String customSetPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("setMethod",av)));

    String customSetManyPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("setManyMethod",av)));
    String customSetManyPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("setManyMethod",av)));

    String customAddPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("addMethod",av)));
    String customAddPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("addMethod",av)));
  
    String customRemovePrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("removeMethod",av)));
    String customRemovePostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("removeMethod",av)));

    String customIsNumberOfValidPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("isNumberOfValidMethod",av)));
    String customIsNumberOfValidPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("isNumberOfValidMethod",av)));
    
    String includeFileOne = null;
    String includeFileTwo = null;
    
    boolean hasIsNumberOfValidMethod = false;
    boolean hasAddManyToManyTemplateMethod = false;
    boolean hasMaximumNumberOfMethod = av.isMany() && !av.isStar();
    boolean hasMinimumNumberOfMethod = av.isMany();
    boolean hasRequiredNumberOfMethod = av.isN();
    boolean hasRemoveManyTemplateMethod = false;
    String includeFile = null;
    String includeFile2 = null;


    if (!relatedAssociation.getIsNavigable())
    {
      if (av.isOptionalOne())
      {
        includeFile = "association_SetUnidirectionalOptionalOne.jet";
      }
      else if (av.isOnlyOne())
      {
        includeFile = "association_SetUnidirectionalOne.jet";
      }
      else if (av.isMStar())
      {
        if (!av.isImmutable())
        {
          includeFile = "association_AddUnidirectionalMStar.jet";
        }
        includeFile2 = "association_SetUnidirectionalMStar.jet";
      }
      else if (av.isMN())
      {
      	if (!av.isImmutable())
      	{
          includeFile = "association_AddUnidirectionalMN.jet";
        }
        includeFile2 = "association_SetUnidirectionalMN.jet";
      }
      else if (av.isN())
      {
        includeFile = "association_SetUnidirectionalN.jet";
      }
      else if (av.isOptionalN())
      {
        if (!av.isImmutable())
      	{
          includeFile = "association_AddUnidirectionalOptionalN.jet";
        }
        includeFile2 = "association_SetUnidirectionalOptionalN.jet";
      }
      else if (av.isImmutable() && av.isMany())
      {
      	includeFile = "association_SetUnidirectionalMany.jet";
      }
      else if (av.isMany())
      {
        includeFile = "association_AddUnidirectionalMany.jet";
      }
    }
    else if (av.isOnlyOne() && relatedAssociation.isOnlyOne())
    {
      //ignore
    }  
    else if (av.isN() && relatedAssociation.isOptionalOne())
    { 
      includeFile = "association_SetNToOptionalOne.jet";
    }
    else if (av.isMN() && relatedAssociation.isOptionalOne())
    {
      includeFile = "association_AddMNToOptionalOne.jet";
      includeFile2 = "association_SetMNToOptionalOne.jet";
    }
    else if (av.isMandatoryMany() && av.isStar() && relatedAssociation.isMany())
    {
      hasIsNumberOfValidMethod = true;
      hasAddManyToManyTemplateMethod = true;
      includeFile = "association_AddMStarToMany.jet";
      includeFile2 = "association_SetMStarToMany.jet";
    }
    else if ((av.isMN() || av.isN()) && relatedAssociation.isMandatoryMany())
    {
      hasIsNumberOfValidMethod = true;
      hasAddManyToManyTemplateMethod = true;
      hasAddManyToManyTemplateMethod = true;
      includeFile = "association_AddMNToMany.jet";
      includeFile2 = "association_SetMNToMany.jet";
    }
    else if ((av.isMN() || av.isN()) && relatedAssociation.isOptionalN())
    {
      hasIsNumberOfValidMethod = true;
      hasAddManyToManyTemplateMethod = true;
      hasAddManyToManyTemplateMethod = true;
      includeFile = "association_AddMNToMany.jet";
    }
    else if ((av.isMN() || av.isN()) && !relatedAssociation.isOne())
    {
      hasIsNumberOfValidMethod = true;
      hasAddManyToManyTemplateMethod = true;
      includeFile = "association_AddMNToMany.jet";
      includeFile2 = "association_SetMNToMany.jet";
    }
    else if (av.isOptionalOne() && relatedAssociation.isOptionalOne())
    {
      includeFile = "association_SetOptionalOneToOptionalOne.jet";
    }
    else if (av.isOptionalOne() && relatedAssociation.isOne())
    {
      includeFile = "association_SetOptionalOneToOne.jet";
    }
    else if (av.isOne() && relatedAssociation.isOptionalOne())
    {
      includeFile = "association_SetOneToOptionalOne.jet";
    }
    else if (av.isMandatoryMany() && av.isStar() && relatedAssociation.isOne())
    {
      hasIsNumberOfValidMethod = true;
      includeFile = "association_AddMandatoryManyToOne.jet";
    }
    else if ((av.isMN() || av.isN()) && relatedAssociation.isOnlyOne())
    {
      hasIsNumberOfValidMethod = true;
      includeFile = "association_AddMNToOnlyOne.jet";
    }
    else if (av.isOptionalN() && relatedAssociation.isOnlyOne())
    {
      includeFile = "association_AddOptionalNToOne.jet";
    }
    else if (av.isOptionalN() && (relatedAssociation.isMN() || relatedAssociation.isOptionalN()))
    {
      hasAddManyToManyTemplateMethod = true;
      if (!av.isImmutable())
      {
      	hasRemoveManyTemplateMethod = true;
      }
    }
    else if (av.isOptionalN() && relatedAssociation.isOptionalMany())
    {
      hasAddManyToManyTemplateMethod = true;
      if (!av.isImmutable())
      {
      	hasRemoveManyTemplateMethod = true;
      }
      includeFile = "association_SetOptionalNToMany.jet";
    }
    else if (av.isMany() && relatedAssociation.isOnlyOne())
    {
      includeFile = "association_AddManyToOne.jet";
    }
    else if (av.isOptionalN() && (relatedAssociation.isMN() || relatedAssociation.isN()))
    {
      hasAddManyToManyTemplateMethod = true;
      if (!av.isImmutable())
      {
      	hasRemoveManyTemplateMethod = true;
      }
    }
    else if (av.isMany() && (relatedAssociation.isMN() || relatedAssociation.isN() || relatedAssociation.isMany()))
    {
      hasAddManyToManyTemplateMethod = true;
      if (!av.isImmutable())
      {
      	hasRemoveManyTemplateMethod = true;
      }
    }
    else if (av.isOptionalN() && relatedAssociation.isOptionalOne())
    {
      includeFile = "association_AddOptionalNToOptionalOne.jet";
    }
    else if (av.isMany() && relatedAssociation.isOptionalOne())
    {
      includeFile = "association_AddManyToOptionalOne.jet";
    }
    else if (av.isOnlyOne() && relatedAssociation.isMandatoryMany() && relatedAssociation.isStar())
    {
      includeFile = "association_SetOneToMandatoryMany.jet";
    }
    else if (av.isOnlyOne() && (relatedAssociation.isMN() || relatedAssociation.isN()))
    {
      includeFile = "association_SetOneToAtMostN.jet";
    }
    else if (av.isOnlyOne() && relatedAssociation.isOptionalN())
    {
      includeFile = "association_SetOneToAtMostN.jet";
    }
    else if (av.isOnlyOne() && relatedAssociation.isMany() && !(av.isMandatory() && !av.isOne()))
    {
      includeFile = "association_SetOneToMany.jet";
    }
    else if (av.isOptionalOne() && relatedAssociation.isOptionalN())
    {
      includeFile = "association_SetOptionalOneToOptionalN.jet";
    }
    else if (av.isOptionalOne() && relatedAssociation.isOptionalMany())
    {
      includeFile = "association_SetOptionalOneToMany.jet";
    }
    else if (av.isOptionalOne() && relatedAssociation.isMandatory())
    {
      //ignore
    }
    else
    {
      
    stringBuffer.append(TEXT_431);
    stringBuffer.append(av);
    stringBuffer.append(TEXT_432);
    stringBuffer.append(relatedAssociation);
    
    }

    boolean addNewLine = false;
    if (hasIsNumberOfValidMethod)
    {
      if (addNewLine) { appendln(stringBuffer,""); }
      addNewLine = true;
      
    stringBuffer.append(TEXT_433);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_434);
    stringBuffer.append(gen.translate("isNumberOfValidMethod",av));
    stringBuffer.append(TEXT_435);
     if (customIsNumberOfValidPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customIsNumberOfValidPrefixCode, "    ")); } 
     if (av.getMultiplicity().isUpperBoundMany()) { 
    stringBuffer.append(TEXT_436);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_437);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_438);
     } else { 
    stringBuffer.append(TEXT_439);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_440);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_441);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_442);
    stringBuffer.append(gen.translate("maximumNumberOfMethod",av));
    stringBuffer.append(TEXT_443);
     } 
     if (customIsNumberOfValidPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customIsNumberOfValidPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_444);
    
    }
    
    if (hasRequiredNumberOfMethod)
    {
      if (addNewLine) { appendln(stringBuffer,""); }
      addNewLine = true;
      
    
    String customRequiredNumberOfPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("requiredNumberOfMethod",av)));
    String customRequiredNumberOfPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("requiredNumberOfMethod",av)));

     if (customRequiredNumberOfPrefixCode == null && customRequiredNumberOfPostfixCode == null) { 
    stringBuffer.append(TEXT_445);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_446);
    stringBuffer.append(gen.translate("requiredNumberOfMethod",av));
    stringBuffer.append(TEXT_447);
    stringBuffer.append(av.getMultiplicity().getLowerBound());
    stringBuffer.append(TEXT_448);
     } else { 
    stringBuffer.append(TEXT_449);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_450);
    stringBuffer.append(gen.translate("requiredNumberOfMethod",av));
    stringBuffer.append(TEXT_451);
     if (customRequiredNumberOfPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRequiredNumberOfPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_452);
    stringBuffer.append(av.getMultiplicity().getLowerBound());
    stringBuffer.append(TEXT_453);
     if (customRequiredNumberOfPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRequiredNumberOfPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_454);
     } 
    
    }

    if (hasMinimumNumberOfMethod)
    {
      if (addNewLine) { appendln(stringBuffer,""); }
      addNewLine = true;
      
    
    String customMinimumNumberOfPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("minimumNumberOfMethod",av)));
    String customMinimumNumberOfPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("minimumNumberOfMethod",av)));

     if (customMinimumNumberOfPrefixCode == null && customMinimumNumberOfPostfixCode == null) { 
    stringBuffer.append(TEXT_455);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_456);
    stringBuffer.append(av.getMultiplicity().getLowerBound());
    stringBuffer.append(TEXT_457);
     } else { 
    stringBuffer.append(TEXT_458);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_459);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_460);
     if (customMinimumNumberOfPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customMinimumNumberOfPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_461);
    stringBuffer.append(av.getMultiplicity().getLowerBound());
    stringBuffer.append(TEXT_462);
     if (customMinimumNumberOfPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customMinimumNumberOfPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_463);
     } 
    
    }
    
    if (hasMaximumNumberOfMethod)
    {
      if (addNewLine) { appendln(stringBuffer,""); }
      addNewLine = true;
      
    
    String customGetPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("getMethod",av)));

    String customMaximumNumberOfPrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before", gen.translate("maximumNumberOfMethod",av)));
    String customMaximumNumberOfPostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after", gen.translate("maximumNumberOfMethod",av)));

     if (customMaximumNumberOfPrefixCode == null && customMaximumNumberOfPostfixCode == null) { 
    stringBuffer.append(TEXT_464);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_465);
    stringBuffer.append(gen.translate("maximumNumberOfMethod",av));
    stringBuffer.append(TEXT_466);
    stringBuffer.append(av.getMultiplicity().getUpperBound());
    stringBuffer.append(TEXT_467);
     } else { 
    stringBuffer.append(TEXT_468);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_469);
    stringBuffer.append(gen.translate("maximumNumberOfMethod",av));
    stringBuffer.append(TEXT_470);
     if (customMaximumNumberOfPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customMaximumNumberOfPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_471);
    stringBuffer.append(av.getMultiplicity().getUpperBound());
    stringBuffer.append(TEXT_472);
     if (customMaximumNumberOfPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customMaximumNumberOfPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_473);
     } 
    
    }
    
    if (hasAddManyToManyTemplateMethod)
    {
      if (addNewLine) { appendln(stringBuffer,""); }
      addNewLine = true;
      
    stringBuffer.append(TEXT_474);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_475);
    stringBuffer.append(gen.translate("addMethod",av));
    stringBuffer.append(TEXT_476);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_477);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_478);
     if (customAddPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
     if (!av.getMultiplicity().isUpperBoundMany()) { 
    stringBuffer.append(TEXT_479);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_480);
    stringBuffer.append(gen.translate("maximumNumberOfMethod",av));
    stringBuffer.append(TEXT_481);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    stringBuffer.append(TEXT_482);
     } 
    stringBuffer.append(TEXT_483);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_484);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_485);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_486);
    stringBuffer.append(gen.relatedTranslate("indexOfMethod",av));
    stringBuffer.append(TEXT_487);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_488);
    stringBuffer.append(gen.relatedTranslate("addMethod",av));
    stringBuffer.append(TEXT_489);
    stringBuffer.append(TEXT_490);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_491);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_492);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_493);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_494);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_495);
    
    }
    
    if (hasRemoveManyTemplateMethod)
    {
      if (addNewLine) { appendln(stringBuffer,""); }
      addNewLine = true;
      
    stringBuffer.append(TEXT_496);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_497);
    stringBuffer.append(gen.translate("removeMethod",av));
    stringBuffer.append(TEXT_498);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_499);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_500);
     if (customRemovePrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    stringBuffer.append(TEXT_501);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_502);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_503);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_504);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    stringBuffer.append(TEXT_505);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_506);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_507);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_508);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_509);
    stringBuffer.append(TEXT_510);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_511);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_512);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_513);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_514);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_515);
    stringBuffer.append(gen.relatedTranslate("indexOfMethod",av));
    stringBuffer.append(TEXT_516);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_517);
    stringBuffer.append(gen.relatedTranslate("removeMethod",av));
    stringBuffer.append(TEXT_518);
    stringBuffer.append(TEXT_519);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_520);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_521);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    stringBuffer.append(TEXT_522);
    
    }

    if (addNewLine) { appendln(stringBuffer,""); }
    addNewLine = true;
    
    // How do you dynamically include a file in JET?!?
    if (includeFile == "association_SetUnidirectionalOptionalOne.jet")
    {
      
    stringBuffer.append(TEXT_523);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_524);
    stringBuffer.append(gen.translate("setMethod",av));
    stringBuffer.append(TEXT_525);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_526);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_527);
     if (customSetPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_528);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_529);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_530);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_531);
    
    }
    else if (includeFile == "association_SetUnidirectionalOne.jet")
    {
      
    stringBuffer.append(TEXT_532);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_533);
    stringBuffer.append(gen.translate("setMethod",av));
    stringBuffer.append(TEXT_534);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_535);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_536);
     if (customSetPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_537);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_538);
    stringBuffer.append(TEXT_539);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_540);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_541);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_542);
    
    }
    else if (includeFile == "association_SetOptionalOneToOne.jet")
    {
      
    stringBuffer.append(TEXT_543);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_544);
    stringBuffer.append(gen.translate("setMethod",av));
    stringBuffer.append(TEXT_545);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_546);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_547);
     if (customSetPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_548);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_549);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_550);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_551);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_552);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_553);
    stringBuffer.append(gen.translate("setMethod",av));
    stringBuffer.append(TEXT_554);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_555);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "      ")); } 
    stringBuffer.append(TEXT_556);
    stringBuffer.append(TEXT_557);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_558);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_559);
    stringBuffer.append(TEXT_560);
    stringBuffer.append(gen.relatedTranslate("type",av));
    stringBuffer.append(TEXT_561);
    stringBuffer.append(gen.relatedTranslate("parameterOld",av));
    stringBuffer.append(TEXT_562);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_563);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_564);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_565);
    stringBuffer.append(gen.relatedTranslate("parameterOld",av));
    stringBuffer.append(TEXT_566);
    stringBuffer.append(gen.relatedTranslate("parameterOld",av));
    stringBuffer.append(TEXT_567);
    stringBuffer.append(TEXT_568);
    stringBuffer.append(gen.relatedTranslate("parameterOld",av));
    stringBuffer.append(TEXT_569);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_570);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_571);
    stringBuffer.append(TEXT_572);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_573);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_574);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_575);
    
    }
    else if (includeFile == "association_SetOneToOptionalOne.jet")
    {
      
    stringBuffer.append(TEXT_576);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_577);
    stringBuffer.append(gen.translate("setMethod",av));
    stringBuffer.append(TEXT_578);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_579);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_580);
     if (customSetPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_581);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_582);
    stringBuffer.append(gen.translate("setMethod",av));
    stringBuffer.append(TEXT_583);
    stringBuffer.append(gen.relatedTranslate("associationOne",av));
    stringBuffer.append(TEXT_584);
    stringBuffer.append(gen.translate("associationOne",av));
     if (customSetPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    stringBuffer.append(TEXT_585);
    stringBuffer.append(TEXT_586);
    stringBuffer.append(gen.relatedTranslate("type",av));
    stringBuffer.append(TEXT_587);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_588);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_589);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_590);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_591);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_592);
    stringBuffer.append(gen.translate("setMethod",av));
    stringBuffer.append(TEXT_593);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_594);
    stringBuffer.append(gen.relatedTranslate("associationOne",av));
    stringBuffer.append(TEXT_595);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    stringBuffer.append(TEXT_596);
    stringBuffer.append(TEXT_597);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_598);
    stringBuffer.append(gen.translate("parameterOld",av));
    stringBuffer.append(TEXT_599);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_600);
    stringBuffer.append(TEXT_601);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_602);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_603);
    stringBuffer.append(TEXT_604);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_605);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_606);
    stringBuffer.append(gen.translate("parameterOld",av));
    stringBuffer.append(TEXT_607);
    stringBuffer.append(TEXT_608);
    stringBuffer.append(gen.translate("parameterOld",av));
    stringBuffer.append(TEXT_609);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_610);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_611);
    
    }
    else if (includeFile == "association_AddMandatoryManyToOne.jet")
    {
      
    stringBuffer.append(TEXT_612);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_613);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_614);
    stringBuffer.append(gen.translate("addMethod",av));
    stringBuffer.append(TEXT_615);
    stringBuffer.append(gen.translate("methodArgumentsExcept",relatedAssociation));
    stringBuffer.append(TEXT_616);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_617);
    stringBuffer.append(gen.translate("callerArgumentsExcept",relatedAssociation));
    stringBuffer.append(TEXT_618);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_619);
    stringBuffer.append(gen.translate("addMethod",av));
    stringBuffer.append(TEXT_620);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_621);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_622);
     if (customAddPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_623);
    stringBuffer.append(gen.relatedTranslate("type",av));
    stringBuffer.append(TEXT_624);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_625);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_626);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_627);
    stringBuffer.append(gen.relatedTranslate("parameterIsNew",av));
    stringBuffer.append(TEXT_628);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_629);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_630);
    stringBuffer.append(gen.relatedTranslate("parameterIsNew",av));
    stringBuffer.append(TEXT_631);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_632);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_633);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_634);
    stringBuffer.append(gen.relatedTranslate("parameterIsNew",av));
    stringBuffer.append(TEXT_635);
    stringBuffer.append(TEXT_636);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_637);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_638);
    stringBuffer.append(TEXT_639);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_640);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_641);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_642);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_643);
    stringBuffer.append(gen.translate("removeMethod",av));
    stringBuffer.append(TEXT_644);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_645);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_646);
     if (customRemovePrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    stringBuffer.append(TEXT_647);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_648);
    stringBuffer.append(gen.relatedTranslate("associationOne",av));
    stringBuffer.append(TEXT_649);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_650);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_651);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    stringBuffer.append(TEXT_652);
    stringBuffer.append(gen.relatedTranslate("associationOne",av));
    stringBuffer.append(TEXT_653);
    stringBuffer.append(av.getMultiplicity().getLowerBound());
    stringBuffer.append(TEXT_654);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_655);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_656);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    stringBuffer.append(TEXT_657);
    stringBuffer.append(TEXT_658);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_659);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_660);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    stringBuffer.append(TEXT_661);
    
    }
    else if (includeFile == "association_AddMNToOnlyOne.jet")
    {
      
    stringBuffer.append(TEXT_662);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_663);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_664);
    stringBuffer.append(gen.translate("addMethod",av));
    stringBuffer.append(TEXT_665);
    stringBuffer.append(gen.translate("methodArgumentsExcept",relatedAssociation));
    stringBuffer.append(TEXT_666);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_667);
    stringBuffer.append(gen.translate("maximumNumberOfMethod",av));
    stringBuffer.append(TEXT_668);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_669);
    stringBuffer.append(gen.translate("callerArgumentsExcept",relatedAssociation));
    stringBuffer.append(TEXT_670);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_671);
    stringBuffer.append(gen.translate("addMethod",av));
    stringBuffer.append(TEXT_672);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_673);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_674);
     if (customAddPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_675);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_676);
    stringBuffer.append(gen.translate("maximumNumberOfMethod",av));
    stringBuffer.append(TEXT_677);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    stringBuffer.append(TEXT_678);
    stringBuffer.append(TEXT_679);
    stringBuffer.append(gen.relatedTranslate("type",av));
    stringBuffer.append(TEXT_680);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_681);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_682);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_683);
    stringBuffer.append(gen.relatedTranslate("parameterIsNew",av));
    stringBuffer.append(TEXT_684);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_685);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_686);
    stringBuffer.append(gen.relatedTranslate("parameterIsNew",av));
    stringBuffer.append(TEXT_687);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_688);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_689);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_690);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    stringBuffer.append(TEXT_691);
    stringBuffer.append(gen.relatedTranslate("parameterIsNew",av));
    stringBuffer.append(TEXT_692);
    stringBuffer.append(TEXT_693);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_694);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_695);
    stringBuffer.append(TEXT_696);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_697);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_698);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_699);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_700);
    stringBuffer.append(gen.translate("removeMethod",av));
    stringBuffer.append(TEXT_701);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_702);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_703);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_704);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_705);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_706);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_707);
     if (customRemovePrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    stringBuffer.append(TEXT_708);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_709);
    stringBuffer.append(gen.relatedTranslate("associationOne",av));
    stringBuffer.append(TEXT_710);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_711);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_712);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    stringBuffer.append(TEXT_713);
    stringBuffer.append(gen.relatedTranslate("associationOne",av));
    stringBuffer.append(TEXT_714);
    stringBuffer.append(av.getMultiplicity().getLowerBound());
    stringBuffer.append(TEXT_715);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_716);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_717);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    stringBuffer.append(TEXT_718);
    stringBuffer.append(TEXT_719);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_720);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_721);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_722);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_723);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_724);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    stringBuffer.append(TEXT_725);
    
    }
    else if (includeFile == "association_AddOptionalNToOne.jet")
    {
      
    stringBuffer.append(TEXT_726);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_727);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_728);
    stringBuffer.append(gen.translate("addMethod",av));
    stringBuffer.append(TEXT_729);
    stringBuffer.append(gen.translate("methodArgumentsExcept",relatedAssociation));
    stringBuffer.append(TEXT_730);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_731);
    stringBuffer.append(gen.translate("maximumNumberOfMethod",av));
    stringBuffer.append(TEXT_732);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_733);
    stringBuffer.append(gen.translate("callerArgumentsExcept",relatedAssociation));
    stringBuffer.append(TEXT_734);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_735);
    stringBuffer.append(gen.translate("addMethod",av));
    stringBuffer.append(TEXT_736);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_737);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_738);
     if (customAddPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_739);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_740);
    stringBuffer.append(gen.translate("maximumNumberOfMethod",av));
    stringBuffer.append(TEXT_741);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    stringBuffer.append(TEXT_742);
    stringBuffer.append(TEXT_743);
    stringBuffer.append(gen.relatedTranslate("type",av));
    stringBuffer.append(TEXT_744);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_745);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_746);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_747);
    stringBuffer.append(gen.relatedTranslate("parameterIsNew",av));
    stringBuffer.append(TEXT_748);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_749);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_750);
    stringBuffer.append(gen.relatedTranslate("parameterIsNew",av));
    stringBuffer.append(TEXT_751);
    stringBuffer.append(TEXT_752);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_753);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_754);
    stringBuffer.append(TEXT_755);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_756);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_757);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_758);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_759);
    stringBuffer.append(gen.translate("removeMethod",av));
    stringBuffer.append(TEXT_760);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_761);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_762);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_763);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_764);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_765);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_766);
     if (customRemovePrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    stringBuffer.append(TEXT_767);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_768);
    stringBuffer.append(gen.relatedTranslate("associationOne",av));
    stringBuffer.append(TEXT_769);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_770);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_771);
    stringBuffer.append(TEXT_772);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_773);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_774);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_775);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_776);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_777);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    stringBuffer.append(TEXT_778);
    
    }
    else if (includeFile == "association_SetOptionalNToMany.jet")
    {
      
    stringBuffer.append(TEXT_779);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_780);
    stringBuffer.append(gen.translate("setManyMethod",av));
    stringBuffer.append(TEXT_781);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_782);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_783);
     if (customSetManyPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_784);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_785);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_786);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_787);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_788);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_789);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_790);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_791);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_792);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_793);
    stringBuffer.append(TEXT_794);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_795);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_796);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_797);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_798);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_799);
    stringBuffer.append(gen.translate("maximumNumberOfMethod",av));
    stringBuffer.append(TEXT_800);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    stringBuffer.append(TEXT_801);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_802);
    stringBuffer.append(gen.translate("parameterOldMany",av));
    stringBuffer.append(TEXT_803);
    stringBuffer.append(TEXT_804);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_805);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_806);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_807);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_808);
    stringBuffer.append(TEXT_809);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_810);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_811);
    stringBuffer.append(gen.translate("parameterOldMany",av));
    stringBuffer.append(TEXT_812);
    stringBuffer.append(gen.translate("parameterOldMany",av));
    stringBuffer.append(TEXT_813);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_814);
    stringBuffer.append(gen.translate("parameterOldMany",av));
    stringBuffer.append(TEXT_815);
    stringBuffer.append(TEXT_816);
    stringBuffer.append(gen.translate("parameterOldMany",av));
    stringBuffer.append(TEXT_817);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_818);
    stringBuffer.append(TEXT_819);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_820);
    stringBuffer.append(gen.relatedTranslate("addMethod",av));
    stringBuffer.append(TEXT_821);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_822);
    stringBuffer.append(gen.translate("parameterOld",av));
    stringBuffer.append(TEXT_823);
    stringBuffer.append(gen.translate("parameterOldMany",av));
    stringBuffer.append(TEXT_824);
    stringBuffer.append(TEXT_825);
    stringBuffer.append(gen.translate("parameterOld",av));
    stringBuffer.append(TEXT_826);
    stringBuffer.append(gen.relatedTranslate("removeMethod",av));
    stringBuffer.append(TEXT_827);
     if (customSetManyPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_828);
    
    }
    else if (includeFile == "association_AddManyToOne.jet")
    {
      
    stringBuffer.append(TEXT_829);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_830);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_831);
    stringBuffer.append(gen.translate("addMethod",av));
    stringBuffer.append(TEXT_832);
    stringBuffer.append(gen.translate("methodArgumentsExcept",relatedAssociation));
    stringBuffer.append(TEXT_833);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_834);
    stringBuffer.append(gen.translate("callerArgumentsExcept",relatedAssociation));
    stringBuffer.append(TEXT_835);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_836);
    stringBuffer.append(gen.translate("addMethod",av));
    stringBuffer.append(TEXT_837);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_838);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_839);
     if (customAddPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_840);
    stringBuffer.append(gen.relatedTranslate("type",av));
    stringBuffer.append(TEXT_841);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_842);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_843);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_844);
    stringBuffer.append(gen.relatedTranslate("parameterIsNew",av));
    stringBuffer.append(TEXT_845);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_846);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_847);
    stringBuffer.append(gen.relatedTranslate("parameterIsNew",av));
    stringBuffer.append(TEXT_848);
    stringBuffer.append(TEXT_849);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_850);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_851);
    stringBuffer.append(TEXT_852);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_853);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_854);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_855);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_856);
    stringBuffer.append(gen.translate("removeMethod",av));
    stringBuffer.append(TEXT_857);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_858);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_859);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_860);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_861);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_862);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_863);
     if (customRemovePrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    stringBuffer.append(TEXT_864);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_865);
    stringBuffer.append(gen.relatedTranslate("associationOne",av));
    stringBuffer.append(TEXT_866);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_867);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_868);
    stringBuffer.append(TEXT_869);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_870);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_871);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_872);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_873);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_874);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    stringBuffer.append(TEXT_875);
    
    }
    else if (includeFile == "association_SetOptionalOneToOptionalOne.jet")
    {
      
    stringBuffer.append(TEXT_876);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_877);
    stringBuffer.append(gen.translate("setMethod",av));
    stringBuffer.append(TEXT_878);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_879);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_880);
     if (customSetPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_881);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_882);
    stringBuffer.append(TEXT_883);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_884);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_885);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_886);
    stringBuffer.append(TEXT_887);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_888);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_889);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_890);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_891);
    stringBuffer.append(TEXT_892);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_893);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_894);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    stringBuffer.append(TEXT_895);
    stringBuffer.append(TEXT_896);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_897);
    stringBuffer.append(gen.translate("parameterCurrent",av));
    stringBuffer.append(TEXT_898);
    stringBuffer.append(gen.translate("getMethod",av));
    stringBuffer.append(TEXT_899);
    stringBuffer.append(gen.translate("parameterCurrent",av));
    stringBuffer.append(TEXT_900);
    stringBuffer.append(gen.translate("parameterCurrent",av));
    stringBuffer.append(TEXT_901);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_902);
    stringBuffer.append(TEXT_903);
    stringBuffer.append(gen.translate("parameterCurrent",av));
    stringBuffer.append(TEXT_904);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_905);
    stringBuffer.append(TEXT_906);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_907);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_908);
    stringBuffer.append(TEXT_909);
    stringBuffer.append(gen.relatedTranslate("type",av));
    stringBuffer.append(TEXT_910);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_911);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_912);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_913);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_914);
    stringBuffer.append(TEXT_915);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_916);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_917);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_918);
    
    }
    else if (includeFile == "association_AddMNToMany.jet")
    {
      
    stringBuffer.append(TEXT_919);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_920);
    stringBuffer.append(gen.translate("removeMethod",av));
    stringBuffer.append(TEXT_921);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_922);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_923);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_924);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_925);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_926);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_927);
     if (customRemovePrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    stringBuffer.append(TEXT_928);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_929);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_930);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_931);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    stringBuffer.append(TEXT_932);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_933);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_934);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    stringBuffer.append(TEXT_935);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_936);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_937);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_938);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_939);
    stringBuffer.append(TEXT_940);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_941);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_942);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_943);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_944);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_945);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_946);
    stringBuffer.append(gen.relatedTranslate("indexOfMethod",av));
    stringBuffer.append(TEXT_947);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_948);
    stringBuffer.append(gen.relatedTranslate("removeMethod",av));
    stringBuffer.append(TEXT_949);
    stringBuffer.append(TEXT_950);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_951);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_952);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    stringBuffer.append(TEXT_953);
    
    }
    else if (includeFile == "association_AddMStarToMany.jet")
    {
      
    stringBuffer.append(TEXT_954);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_955);
    stringBuffer.append(gen.translate("removeMethod",av));
    stringBuffer.append(TEXT_956);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_957);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_958);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_959);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_960);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_961);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_962);
     if (customRemovePrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    stringBuffer.append(TEXT_963);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_964);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_965);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_966);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_967);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    stringBuffer.append(TEXT_968);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_969);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_970);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    stringBuffer.append(TEXT_971);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_972);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_973);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_974);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_975);
    stringBuffer.append(TEXT_976);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_977);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_978);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_979);
    stringBuffer.append(gen.relatedTranslate("indexOfMethod",av));
    stringBuffer.append(TEXT_980);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_981);
    stringBuffer.append(gen.relatedTranslate("removeMethod",av));
    stringBuffer.append(TEXT_982);
    stringBuffer.append(TEXT_983);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_984);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_985);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    stringBuffer.append(TEXT_986);
    
    }
    else if (includeFile == "association_SetOptionalOneToOptionalN.jet")
    {
      
    stringBuffer.append(TEXT_987);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_988);
    stringBuffer.append(gen.translate("setMethod",av));
    stringBuffer.append(TEXT_989);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_990);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_991);
     if (customSetPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_992);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_993);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_994);
    stringBuffer.append(gen.relatedTranslate("numberOfMethod",av));
    stringBuffer.append(TEXT_995);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_996);
    stringBuffer.append(gen.relatedTranslate("maximumNumberOfMethod",av));
    stringBuffer.append(TEXT_997);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    stringBuffer.append(TEXT_998);
    stringBuffer.append(TEXT_999);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1000);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1001);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1002);
    stringBuffer.append(TEXT_1003);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1004);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1005);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1006);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1007);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1008);
    stringBuffer.append(TEXT_1009);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1010);
    stringBuffer.append(gen.relatedTranslate("removeMethod",av));
    stringBuffer.append(TEXT_1011);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1012);
    stringBuffer.append(TEXT_1013);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1014);
    stringBuffer.append(gen.relatedTranslate("addMethod",av));
    stringBuffer.append(TEXT_1015);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_1016);
    
    }
    else if (includeFile == "association_SetOneToMany.jet")
    {
      
    stringBuffer.append(TEXT_1017);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_1018);
    stringBuffer.append(gen.translate("setMethod",av));
    stringBuffer.append(TEXT_1019);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1020);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1021);
     if (customSetPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_1022);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1023);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    stringBuffer.append(TEXT_1024);
    stringBuffer.append(TEXT_1025);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1026);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1027);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1028);
    stringBuffer.append(TEXT_1029);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1030);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1031);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1032);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1033);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1034);
    stringBuffer.append(TEXT_1035);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1036);
    stringBuffer.append(gen.relatedTranslate("removeMethod",av));
    stringBuffer.append(TEXT_1037);
    stringBuffer.append(TEXT_1038);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1039);
    stringBuffer.append(gen.relatedTranslate("addMethod",av));
    stringBuffer.append(TEXT_1040);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_1041);
    
    }
    else if (includeFile == "association_SetOneToAtMostN.jet")
    {
      
    stringBuffer.append(TEXT_1042);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_1043);
    stringBuffer.append(gen.translate("setMethod",av));
    stringBuffer.append(TEXT_1044);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1045);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1046);
     if (customSetPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_1047);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1048);
    stringBuffer.append(gen.relatedTranslate("associationOne",av));
    stringBuffer.append(TEXT_1049);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1050);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    stringBuffer.append(TEXT_1051);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1052);
    stringBuffer.append(relatedAssociation.getMultiplicity().getUpperBound());
    stringBuffer.append(TEXT_1053);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1054);
    stringBuffer.append(gen.relatedTranslate("numberOfMethod",av));
    stringBuffer.append(TEXT_1055);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1056);
    stringBuffer.append(gen.relatedTranslate("maximumNumberOfMethod",av));
    stringBuffer.append(TEXT_1057);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    stringBuffer.append(TEXT_1058);
    stringBuffer.append(TEXT_1059);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1060);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1061);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1062);
    stringBuffer.append(TEXT_1063);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1064);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1065);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1066);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1067);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1068);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1069);
    stringBuffer.append(gen.relatedTranslate("removeMethod",av));
    stringBuffer.append(TEXT_1070);
    stringBuffer.append(TEXT_1071);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1072);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1073);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    stringBuffer.append(TEXT_1074);
    stringBuffer.append(TEXT_1075);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1076);
    stringBuffer.append(gen.relatedTranslate("addMethod",av));
    stringBuffer.append(TEXT_1077);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_1078);
    
    }
    else if (includeFile == "association_SetOneToMandatoryMany.jet")
    {
      
    stringBuffer.append(TEXT_1079);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_1080);
    stringBuffer.append(gen.translate("setMethod",av));
    stringBuffer.append(TEXT_1081);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1082);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1083);
     if (customSetPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_1084);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1085);
    stringBuffer.append(gen.relatedTranslate("associationOne",av));
    stringBuffer.append(TEXT_1086);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1087);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    stringBuffer.append(TEXT_1088);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1089);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1090);
    stringBuffer.append(gen.relatedTranslate("numberOfMethod",av));
    stringBuffer.append(TEXT_1091);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1092);
    stringBuffer.append(gen.relatedTranslate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_1093);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    stringBuffer.append(TEXT_1094);
    stringBuffer.append(TEXT_1095);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1096);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1097);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1098);
    stringBuffer.append(TEXT_1099);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1100);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1101);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1102);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1103);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1104);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1105);
    stringBuffer.append(gen.relatedTranslate("removeMethod",av));
    stringBuffer.append(TEXT_1106);
    stringBuffer.append(TEXT_1107);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1108);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1109);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "      ")); } 
    stringBuffer.append(TEXT_1110);
    stringBuffer.append(TEXT_1111);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1112);
    stringBuffer.append(gen.relatedTranslate("addMethod",av));
    stringBuffer.append(TEXT_1113);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_1114);
    
    }
    else if (includeFile == "association_AddManyToOptionalOne.jet")
    {
      
    stringBuffer.append(TEXT_1115);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_1116);
    stringBuffer.append(gen.translate("addMethod",av));
    stringBuffer.append(TEXT_1117);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1118);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1119);
     if (customAddPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_1120);
    stringBuffer.append(gen.relatedTranslate("type",av));
    stringBuffer.append(TEXT_1121);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_1122);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1123);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_1124);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_1125);
    stringBuffer.append(TEXT_1126);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1127);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_1128);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_1129);
    stringBuffer.append(TEXT_1130);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_1131);
    stringBuffer.append(gen.translate("removeMethod",av));
    stringBuffer.append(TEXT_1132);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1133);
    stringBuffer.append(TEXT_1134);
    stringBuffer.append(gen.translate("addMethod",av));
    stringBuffer.append(TEXT_1135);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1136);
    stringBuffer.append(TEXT_1137);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1138);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1139);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_1140);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_1141);
    stringBuffer.append(gen.translate("removeMethod",av));
    stringBuffer.append(TEXT_1142);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1143);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1144);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1145);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1146);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1147);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1148);
     if (customRemovePrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    stringBuffer.append(TEXT_1149);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1150);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1151);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1152);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1153);
    stringBuffer.append(TEXT_1154);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1155);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1156);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1157);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1158);
    stringBuffer.append(TEXT_1159);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1160);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_1161);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1162);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    stringBuffer.append(TEXT_1163);
    
    }
    else if (includeFile == "association_SetOptionalOneToMany.jet")
    {
      
    stringBuffer.append(TEXT_1164);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_1165);
    stringBuffer.append(gen.translate("setMethod",av));
    stringBuffer.append(TEXT_1166);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1167);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1168);
     if (customSetPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_1169);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1170);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1171);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1172);
    stringBuffer.append(TEXT_1173);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1174);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1175);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1176);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1177);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1178);
    stringBuffer.append(TEXT_1179);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1180);
    stringBuffer.append(gen.relatedTranslate("removeMethod",av));
    stringBuffer.append(TEXT_1181);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1182);
    stringBuffer.append(TEXT_1183);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1184);
    stringBuffer.append(gen.relatedTranslate("addMethod",av));
    stringBuffer.append(TEXT_1185);
     if (customSetPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_1186);
    
    }
    else if (includeFile == "association_AddOptionalNToOptionalOne.jet")
    {
      
    stringBuffer.append(TEXT_1187);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_1188);
    stringBuffer.append(gen.translate("addMethod",av));
    stringBuffer.append(TEXT_1189);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1190);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1191);
     if (customAddPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_1192);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_1193);
    stringBuffer.append(gen.translate("maximumNumberOfMethod",av));
    stringBuffer.append(TEXT_1194);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    stringBuffer.append(TEXT_1195);
    stringBuffer.append(TEXT_1196);
    stringBuffer.append(gen.relatedTranslate("type",av));
    stringBuffer.append(TEXT_1197);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_1198);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1199);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_1200);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_1201);
    stringBuffer.append(TEXT_1202);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1203);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_1204);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_1205);
    stringBuffer.append(TEXT_1206);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_1207);
    stringBuffer.append(gen.translate("removeMethod",av));
    stringBuffer.append(TEXT_1208);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1209);
    stringBuffer.append(TEXT_1210);
    stringBuffer.append(gen.translate("addMethod",av));
    stringBuffer.append(TEXT_1211);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1212);
    stringBuffer.append(TEXT_1213);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1214);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1215);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_1216);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_1217);
    stringBuffer.append(gen.translate("removeMethod",av));
    stringBuffer.append(TEXT_1218);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1219);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1220);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1221);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1222);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1223);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1224);
     if (customRemovePrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    stringBuffer.append(TEXT_1225);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1226);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1227);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1228);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1229);
    stringBuffer.append(TEXT_1230);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1231);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1232);
    stringBuffer.append(TEXT_1233);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1234);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_1235);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1236);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    stringBuffer.append(TEXT_1237);
    
    }
    else if (includeFile == "association_AddUnidirectionalMN.jet")
    {
      
    stringBuffer.append(TEXT_1238);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_1239);
    stringBuffer.append(gen.translate("addMethod",av));
    stringBuffer.append(TEXT_1240);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1241);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1242);
     if (customAddPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_1243);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_1244);
    stringBuffer.append(gen.translate("maximumNumberOfMethod",av));
    stringBuffer.append(TEXT_1245);
    stringBuffer.append(TEXT_1246);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1247);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1248);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_1249);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_1250);
    stringBuffer.append(gen.translate("removeMethod",av));
    stringBuffer.append(TEXT_1251);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1252);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1253);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1254);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1255);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1256);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1257);
     if (customRemovePrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    stringBuffer.append(TEXT_1258);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1259);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1260);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1261);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1262);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    stringBuffer.append(TEXT_1263);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_1264);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_1265);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    stringBuffer.append(TEXT_1266);
    stringBuffer.append(TEXT_1267);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1268);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1269);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1270);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1271);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1272);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    stringBuffer.append(TEXT_1273);
    
    }
    else if (includeFile == "association_AddMNToOptionalOne.jet")
    {
      
    stringBuffer.append(TEXT_1274);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_1275);
    stringBuffer.append(gen.translate("addMethod",av));
    stringBuffer.append(TEXT_1276);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1277);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1278);
     if (customAddPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
     if (!av.isStar()) { 
    stringBuffer.append(TEXT_1279);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_1280);
    stringBuffer.append(gen.translate("maximumNumberOfMethod",av));
    stringBuffer.append(TEXT_1281);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    stringBuffer.append(TEXT_1282);
     } 
    stringBuffer.append(TEXT_1283);
    stringBuffer.append(gen.relatedTranslate("type",av));
    stringBuffer.append(TEXT_1284);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_1285);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1286);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_1287);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_1288);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_1289);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_1290);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_1291);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    stringBuffer.append(TEXT_1292);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_1293);
    stringBuffer.append(TEXT_1294);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_1295);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1296);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1297);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1298);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1299);
    stringBuffer.append(TEXT_1300);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1301);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1302);
    stringBuffer.append(TEXT_1303);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_1304);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1305);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "      ")); } 
    stringBuffer.append(TEXT_1306);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_1307);
    stringBuffer.append(gen.translate("removeMethod",av));
    stringBuffer.append(TEXT_1308);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1309);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1310);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1311);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1312);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1313);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1314);
     if (customRemovePrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    stringBuffer.append(TEXT_1315);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1316);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1317);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1318);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1319);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_1320);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_1321);
    stringBuffer.append(TEXT_1322);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1323);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1324);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1325);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1326);
    stringBuffer.append(TEXT_1327);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_1328);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1329);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1330);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    stringBuffer.append(TEXT_1331);
    
    }
    else if (includeFile == "association_SetNToOptionalOne.jet")
    {
      
    stringBuffer.append(TEXT_1332);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_1333);
    stringBuffer.append(gen.translate("setManyMethod",av));
    stringBuffer.append(TEXT_1334);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1335);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1336);
     if (customSetManyPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_1337);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1338);
    stringBuffer.append(gen.translate("parameterCheckNewMany",av));
    stringBuffer.append(TEXT_1339);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1340);
    stringBuffer.append(gen.translate("associationNew",av));
    stringBuffer.append(TEXT_1341);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1342);
    stringBuffer.append(gen.translate("parameterCheckNewMany",av));
    stringBuffer.append(TEXT_1343);
    stringBuffer.append(gen.translate("parameterCheckNewMany",av));
    stringBuffer.append(TEXT_1344);
    stringBuffer.append(gen.translate("associationNew",av));
    stringBuffer.append(TEXT_1345);
    stringBuffer.append(gen.translate("parameterCheckNewMany",av));
    stringBuffer.append(TEXT_1346);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "        ")); } 
    stringBuffer.append(TEXT_1347);
    stringBuffer.append(gen.translate("associationNew",av));
    stringBuffer.append(TEXT_1348);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_1349);
    stringBuffer.append(gen.translate("associationNew",av));
    stringBuffer.append(TEXT_1350);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_1351);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "        ")); } 
    stringBuffer.append(TEXT_1352);
    stringBuffer.append(TEXT_1353);
    stringBuffer.append(gen.translate("parameterCheckNewMany",av));
    stringBuffer.append(TEXT_1354);
    stringBuffer.append(gen.translate("associationNew",av));
    stringBuffer.append(TEXT_1355);
    stringBuffer.append(gen.translate("parameterCheckNewMany",av));
    stringBuffer.append(TEXT_1356);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_1357);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    stringBuffer.append(TEXT_1358);
    stringBuffer.append(TEXT_1359);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1360);
    stringBuffer.append(gen.translate("parameterCheckNewMany",av));
    stringBuffer.append(TEXT_1361);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1362);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1363);
    stringBuffer.append(TEXT_1364);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_1365);
    stringBuffer.append(TEXT_1366);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1367);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1368);
    stringBuffer.append(gen.translate("associationNew",av));
    stringBuffer.append(TEXT_1369);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1370);
    stringBuffer.append(TEXT_1371);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_1372);
    stringBuffer.append(gen.translate("associationNew",av));
    stringBuffer.append(TEXT_1373);
    stringBuffer.append(TEXT_1374);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1375);
    stringBuffer.append(gen.translate("associationNew",av));
    stringBuffer.append(TEXT_1376);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_1377);
    stringBuffer.append(TEXT_1378);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_1379);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_1380);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1381);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1382);
    stringBuffer.append(gen.relatedTranslate("type",av));
    stringBuffer.append(TEXT_1383);
    stringBuffer.append(gen.relatedTranslate("parameterOne",av));
    stringBuffer.append(TEXT_1384);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1385);
    stringBuffer.append(gen.relatedTranslate("associationOne",av));
    stringBuffer.append(TEXT_1386);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1387);
    stringBuffer.append(gen.relatedTranslate("parameterOne",av));
    stringBuffer.append(TEXT_1388);
    stringBuffer.append(gen.relatedTranslate("parameterOne",av));
    stringBuffer.append(TEXT_1389);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1390);
    
    }
    else if (includeFile == "association_AddUnidirectionalMany.jet")
    {
      
    stringBuffer.append(TEXT_1391);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_1392);
    stringBuffer.append(gen.translate("addMethod",av));
    stringBuffer.append(TEXT_1393);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1394);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1395);
     if (customAddPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_1396);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1397);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1398);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_1399);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_1400);
    stringBuffer.append(gen.translate("removeMethod",av));
    stringBuffer.append(TEXT_1401);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1402);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1403);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1404);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1405);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1406);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1407);
     if (customRemovePrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    stringBuffer.append(TEXT_1408);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1409);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1410);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1411);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1412);
    stringBuffer.append(TEXT_1413);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1414);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1415);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1416);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1417);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1418);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    stringBuffer.append(TEXT_1419);
    
    }
    else if (includeFile == "association_AddUnidirectionalOptionalN.jet")
    {
      
    stringBuffer.append(TEXT_1420);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_1421);
    stringBuffer.append(gen.translate("addMethod",av));
    stringBuffer.append(TEXT_1422);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1423);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1424);
     if (customAddPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_1425);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_1426);
    stringBuffer.append(gen.translate("maximumNumberOfMethod",av));
    stringBuffer.append(TEXT_1427);
    stringBuffer.append(TEXT_1428);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1429);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1430);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_1431);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_1432);
    stringBuffer.append(gen.translate("removeMethod",av));
    stringBuffer.append(TEXT_1433);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1434);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1435);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1436);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1437);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1438);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1439);
     if (customRemovePrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    stringBuffer.append(TEXT_1440);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1441);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1442);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1443);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1444);
    stringBuffer.append(TEXT_1445);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1446);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1447);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1448);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    stringBuffer.append(TEXT_1449);
    
    }
    else if (includeFile == "association_AddUnidirectionalMStar.jet")
    {
      
    stringBuffer.append(TEXT_1450);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_1451);
    stringBuffer.append(gen.translate("addMethod",av));
    stringBuffer.append(TEXT_1452);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1453);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1454);
     if (customAddPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customAddPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_1455);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1456);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1457);
     if (customAddPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customAddPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_1458);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_1459);
    stringBuffer.append(gen.translate("removeMethod",av));
    stringBuffer.append(TEXT_1460);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1461);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1462);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1463);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1464);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1465);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1466);
     if (customRemovePrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePrefixCode, "    ")); } 
    stringBuffer.append(TEXT_1467);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1468);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1469);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1470);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1471);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    stringBuffer.append(TEXT_1472);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_1473);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_1474);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "      ")); } 
    stringBuffer.append(TEXT_1475);
    stringBuffer.append(TEXT_1476);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1477);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1478);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1479);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1480);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1481);
     if (customRemovePostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customRemovePostfixCode, "    ")); } 
    stringBuffer.append(TEXT_1482);
    
    }
    else if (includeFile == "association_SetUnidirectionalN.jet")
    {
      
    stringBuffer.append(TEXT_1483);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_1484);
    stringBuffer.append(gen.translate("setManyMethod",av));
    stringBuffer.append(TEXT_1485);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1486);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1487);
     if (customSetManyPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_1488);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1489);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1490);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1491);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1492);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1493);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1494);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1495);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1496);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1497);
    stringBuffer.append(TEXT_1498);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1499);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1500);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1501);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1502);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1503);
    stringBuffer.append(gen.translate("requiredNumberOfMethod",av));
    stringBuffer.append(TEXT_1504);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    stringBuffer.append(TEXT_1505);
    stringBuffer.append(TEXT_1506);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1507);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1508);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1509);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1510);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_1511);
    
    }
    else if (includeFile == "association_SetUnidirectionalMany.jet")
    {
    	
     String accessModifier = (av.isImmutable()) ? "private" : "public"; 
    stringBuffer.append(TEXT_1512);
    stringBuffer.append( accessModifier );
    stringBuffer.append(TEXT_1513);
    stringBuffer.append(gen.translate("setManyMethod",av));
    stringBuffer.append(TEXT_1514);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1515);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1516);
     if (customSetManyPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_1517);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1518);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1519);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1520);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1521);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1522);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1523);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1524);
    stringBuffer.append(TEXT_1525);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1526);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1527);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1528);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1529);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    stringBuffer.append(TEXT_1530);
    stringBuffer.append(TEXT_1531);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1532);
    stringBuffer.append(TEXT_1533);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1534);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1535);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_1536);
    
    }
    else if (includeFile != null)
    {
      appendln(stringBuffer,"You forgot to include {0}",includeFile);
    }
    
    if (includeFile2 == "association_SetMNToMany.jet")
    {
      
    stringBuffer.append(TEXT_1537);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_1538);
    stringBuffer.append(gen.translate("setManyMethod",av));
    stringBuffer.append(TEXT_1539);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1540);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1541);
     if (customSetManyPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_1542);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1543);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1544);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1545);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1546);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1547);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1548);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1549);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1550);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1551);
    stringBuffer.append(TEXT_1552);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1553);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1554);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1555);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1556);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1557);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_1558);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1559);
    stringBuffer.append(gen.translate("maximumNumberOfMethod",av));
    stringBuffer.append(TEXT_1560);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    stringBuffer.append(TEXT_1561);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1562);
    stringBuffer.append(gen.translate("parameterOldMany",av));
    stringBuffer.append(TEXT_1563);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1564);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1565);
    stringBuffer.append(TEXT_1566);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1567);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1568);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_1569);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1570);
    stringBuffer.append(TEXT_1571);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1572);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_1573);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1574);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1575);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1576);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1577);
    stringBuffer.append(TEXT_1578);
    stringBuffer.append(gen.translate("parameterOldMany",av));
    stringBuffer.append(TEXT_1579);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1580);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1581);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1582);
    stringBuffer.append(TEXT_1583);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_1584);
    stringBuffer.append(gen.relatedTranslate("addMethod",av));
    stringBuffer.append(TEXT_1585);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1586);
    stringBuffer.append(gen.translate("parameterOld",av));
    stringBuffer.append(TEXT_1587);
    stringBuffer.append(gen.translate("parameterOldMany",av));
    stringBuffer.append(TEXT_1588);
    stringBuffer.append(TEXT_1589);
    stringBuffer.append(gen.translate("parameterOld",av));
    stringBuffer.append(TEXT_1590);
    stringBuffer.append(gen.relatedTranslate("removeMethod",av));
    stringBuffer.append(TEXT_1591);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_1592);
    
    }
    else if (includeFile2 == "association_SetMStarToMany.jet")
    {
      
    stringBuffer.append(TEXT_1593);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_1594);
    stringBuffer.append(gen.translate("setManyMethod",av));
    stringBuffer.append(TEXT_1595);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1596);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1597);
     if (customSetManyPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_1598);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1599);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1600);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1601);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1602);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1603);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1604);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1605);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1606);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1607);
    stringBuffer.append(TEXT_1608);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1609);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1610);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1611);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1612);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1613);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_1614);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    stringBuffer.append(TEXT_1615);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1616);
    stringBuffer.append(gen.translate("parameterOldMany",av));
    stringBuffer.append(TEXT_1617);
    stringBuffer.append(TEXT_1618);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1619);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1620);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_1621);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1622);
    stringBuffer.append(TEXT_1623);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1624);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_1625);
    stringBuffer.append(gen.translate("parameterOldMany",av));
    stringBuffer.append(TEXT_1626);
    stringBuffer.append(gen.translate("parameterOldMany",av));
    stringBuffer.append(TEXT_1627);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_1628);
    stringBuffer.append(gen.translate("parameterOldMany",av));
    stringBuffer.append(TEXT_1629);
    stringBuffer.append(TEXT_1630);
    stringBuffer.append(gen.translate("parameterOldMany",av));
    stringBuffer.append(TEXT_1631);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_1632);
    stringBuffer.append(TEXT_1633);
    stringBuffer.append(gen.translate("parameterNew",av));
    stringBuffer.append(TEXT_1634);
    stringBuffer.append(gen.relatedTranslate("addMethod",av));
    stringBuffer.append(TEXT_1635);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1636);
    stringBuffer.append(gen.translate("parameterOld",av));
    stringBuffer.append(TEXT_1637);
    stringBuffer.append(gen.translate("parameterOldMany",av));
    stringBuffer.append(TEXT_1638);
    stringBuffer.append(TEXT_1639);
    stringBuffer.append(gen.translate("parameterOld",av));
    stringBuffer.append(TEXT_1640);
    stringBuffer.append(gen.relatedTranslate("removeMethod",av));
    stringBuffer.append(TEXT_1641);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_1642);
    
    }
    else if (includeFile2 == "association_SetUnidirectionalMN.jet")
    {
      
    stringBuffer.append(TEXT_1643);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_1644);
    stringBuffer.append(gen.translate("setManyMethod",av));
    stringBuffer.append(TEXT_1645);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1646);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1647);
     if (customSetManyPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_1648);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1649);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1650);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1651);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1652);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1653);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1654);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1655);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1656);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1657);
    stringBuffer.append(TEXT_1658);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1659);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1660);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1661);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1662);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1663);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_1664);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1665);
    stringBuffer.append(gen.translate("maximumNumberOfMethod",av));
    stringBuffer.append(TEXT_1666);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    stringBuffer.append(TEXT_1667);
    stringBuffer.append(TEXT_1668);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1669);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1670);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1671);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1672);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_1673);
    
    }
    else if (includeFile2 == "association_SetMNToOptionalOne.jet")
    {
      
    
  String existingToNewMap = StringFormatter.format("{0}ToNew{1}", relatedAssociation.getName(), av.getUpperCaseName());
  String orCheckMaxBound = av.isStar() ? "" : StringFormatter.format(" || {0}.length > {1}()", gen.translate("parameterMany",av), gen.translate("maximumNumberOfMethod",av));

    stringBuffer.append(TEXT_1674);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_1675);
    stringBuffer.append(gen.translate("setManyMethod",av));
    stringBuffer.append(TEXT_1676);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1677);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1678);
     if (customSetManyPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_1679);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1680);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_1681);
    stringBuffer.append(orCheckMaxBound);
    stringBuffer.append(TEXT_1682);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    stringBuffer.append(TEXT_1683);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1684);
    stringBuffer.append(gen.translate("parameterCheckNewMany",av));
    stringBuffer.append(TEXT_1685);
    stringBuffer.append(gen.relatedTranslate("type",av));
    stringBuffer.append(TEXT_1686);
    stringBuffer.append(existingToNewMap);
    stringBuffer.append(TEXT_1687);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1688);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1689);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1690);
    stringBuffer.append(gen.translate("parameterCheckNewMany",av));
    stringBuffer.append(TEXT_1691);
    stringBuffer.append(gen.translate("parameterCheckNewMany",av));
    stringBuffer.append(TEXT_1692);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1693);
    stringBuffer.append(gen.translate("parameterCheckNewMany",av));
    stringBuffer.append(TEXT_1694);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "        ")); } 
    stringBuffer.append(TEXT_1695);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1696);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_1697);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1698);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_1699);
    stringBuffer.append(TEXT_1700);
    stringBuffer.append(gen.relatedTranslate("type",av));
    stringBuffer.append(TEXT_1701);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_1702);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1703);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_1704);
    stringBuffer.append(existingToNewMap);
    stringBuffer.append(TEXT_1705);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_1706);
    stringBuffer.append(TEXT_1707);
    stringBuffer.append(existingToNewMap);
    stringBuffer.append(TEXT_1708);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_1709);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_1710);
    stringBuffer.append(gen.translate("numberOfMethod",av));
    stringBuffer.append(TEXT_1711);
    stringBuffer.append(existingToNewMap);
    stringBuffer.append(TEXT_1712);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_1713);
    stringBuffer.append(av.getMultiplicity().getLowerBound());
    stringBuffer.append(TEXT_1714);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "          ")); } 
    stringBuffer.append(TEXT_1715);
    stringBuffer.append(TEXT_1716);
    stringBuffer.append(existingToNewMap);
    stringBuffer.append(TEXT_1717);
    stringBuffer.append(gen.relatedTranslate("parameterExisting",av));
    stringBuffer.append(TEXT_1718);
    stringBuffer.append(TEXT_1719);
    stringBuffer.append(gen.translate("parameterCheckNewMany",av));
    stringBuffer.append(TEXT_1720);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1721);
    stringBuffer.append(TEXT_1722);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1723);
    stringBuffer.append(gen.translate("parameterCheckNewMany",av));
    stringBuffer.append(TEXT_1724);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1725);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1726);
    stringBuffer.append(TEXT_1727);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_1728);
    stringBuffer.append(TEXT_1729);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1730);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1731);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1732);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1733);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1734);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_1735);
    stringBuffer.append(TEXT_1736);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1737);
    stringBuffer.append(gen.relatedTranslate("getMethod",av));
    stringBuffer.append(TEXT_1738);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1739);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1740);
    stringBuffer.append(TEXT_1741);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_1742);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1743);
    stringBuffer.append(TEXT_1744);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1745);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1746);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_1747);
    stringBuffer.append(TEXT_1748);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_1749);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_1750);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1751);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1752);
    stringBuffer.append(gen.relatedTranslate("type",av));
    stringBuffer.append(TEXT_1753);
    stringBuffer.append(gen.relatedTranslate("parameterOne",av));
    stringBuffer.append(TEXT_1754);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1755);
    stringBuffer.append(gen.relatedTranslate("associationOne",av));
    stringBuffer.append(TEXT_1756);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1757);
    stringBuffer.append(gen.relatedTranslate("parameterOne",av));
    stringBuffer.append(TEXT_1758);
    stringBuffer.append(gen.relatedTranslate("parameterOne",av));
    stringBuffer.append(TEXT_1759);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1760);
    
    }
    else if (includeFile2 == "association_SetUnidirectionalOptionalN.jet")
    {
      
    stringBuffer.append(TEXT_1761);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_1762);
    stringBuffer.append(gen.translate("setManyMethod",av));
    stringBuffer.append(TEXT_1763);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1764);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1765);
     if (customSetManyPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_1766);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1767);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1768);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1769);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1770);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1771);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1772);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1773);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1774);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1775);
    stringBuffer.append(TEXT_1776);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1777);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1778);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1779);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1780);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1781);
    stringBuffer.append(gen.translate("maximumNumberOfMethod",av));
    stringBuffer.append(TEXT_1782);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    stringBuffer.append(TEXT_1783);
    stringBuffer.append(TEXT_1784);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1785);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1786);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1787);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1788);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_1789);
    
    }
    else if (includeFile2 == "association_SetUnidirectionalMStar.jet")
    {
      
    stringBuffer.append(TEXT_1790);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_1791);
    stringBuffer.append(gen.translate("setManyMethod",av));
    stringBuffer.append(TEXT_1792);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1793);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1794);
     if (customSetManyPrefixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetManyPrefixCode, "    ")); } 
    stringBuffer.append(TEXT_1795);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1796);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1797);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1798);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1799);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1800);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1801);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1802);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1803);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1804);
    stringBuffer.append(TEXT_1805);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1806);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1807);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1808);
    stringBuffer.append(gen.translate("parameterMany",av));
    stringBuffer.append(TEXT_1809);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1810);
    stringBuffer.append(gen.translate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_1811);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "      ")); } 
    stringBuffer.append(TEXT_1812);
    stringBuffer.append(TEXT_1813);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1814);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1815);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1816);
    stringBuffer.append(gen.translate("parameterVerifiedMany",av));
    stringBuffer.append(TEXT_1817);
     if (customSetManyPostfixCode != null) { append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customSetManyPostfixCode, "    ")); } 
    stringBuffer.append(TEXT_1818);
    
    }
    else if (includeFile2 != null)
    {
      appendln(stringBuffer,"You forgot to include {0}",includeFile2);
    }
  }

     if (uClass.getKey().isProvided()) { 
    

  StringBuilder checks = new StringBuilder();
  StringBuilder hash = new StringBuilder();
  StringBuilder canSet = new StringBuilder();
  
  for(String memberId : uClass.getKey().getMembers())
  {
    Attribute av = uClass.getAttribute(memberId);
    AssociationVariable as = uClass.getAssociationVariable(memberId);
    if (av != null)
    {
      canSet.append(StringFormatter.format("    {0} = false;\n",gen.translate("attributeCanSet",av)));
      if (av.getIsList())
      {
        checks.append(StringFormatter.format("    if ({0}.size() != compareTo.{0}.size())\n",gen.translate("attributeMany",av)));
        checks.append(StringFormatter.format("    {\n"));
        checks.append(StringFormatter.format("      return false;\n"));
        checks.append(StringFormatter.format("    }\n\n"));
        checks.append(StringFormatter.format("    for (int i=0; i<{0}.size(); i++)\n",gen.translate("attributeMany",av)));
        checks.append(StringFormatter.format("    {\n"));
        checks.append(StringFormatter.format("      {0} me = {1}.get(i);\n",gen.translate("type",av),gen.translate("attributeMany",av)));
        checks.append(StringFormatter.format("      {0} them = compareTo.{1}.get(i);\n",gen.translate("type",av),gen.translate("attributeMany",av)));
        checks.append(StringFormatter.format("      if (me == null && them != null)\n"));
        checks.append(StringFormatter.format("      {\n"));
        checks.append(StringFormatter.format("       return false;\n"));
        checks.append(StringFormatter.format("      }\n"));
        checks.append(StringFormatter.format("      else if (me != null && !me.equals(them))\n"));
        checks.append(StringFormatter.format("      {\n"));
        checks.append(StringFormatter.format("        return false;\n"));
        checks.append(StringFormatter.format("      }\n"));
        checks.append(StringFormatter.format("    }\n"));
      }
      else if ("Integer".equals(av.getType()) || "Boolean".equals(av.getType()) || "Double".equals(av.getType()))
      {
        checks.append(StringFormatter.format("    if ({0} != compareTo.{0})\n",gen.translate("attributeOne",av)));
        checks.append(StringFormatter.format("    {\n"));
        checks.append(StringFormatter.format("      return false;\n"));
        checks.append(StringFormatter.format("    }\n"));
      }
      else
      {
        checks.append(StringFormatter.format("    if ({0} == null && compareTo.{0} != null)\n",gen.translate("attributeOne",av)));
        checks.append(StringFormatter.format("    {\n"));
        checks.append(StringFormatter.format("      return false;\n"));
        checks.append(StringFormatter.format("    }\n"));
        checks.append(StringFormatter.format("    else if ({0} != null && !{0}.equals(compareTo.{0}))\n",gen.translate("attributeOne",av)));
        checks.append(StringFormatter.format("    {\n"));
        checks.append(StringFormatter.format("      return false;\n"));
        checks.append(StringFormatter.format("    }\n"));
      }
      checks.append("\n");
    }
    else if (as != null)
    {
      canSet.append(StringFormatter.format("    {0} = false;\n",gen.translate("associationCanSet",as)));
      if (as.isMany())
      {
        checks.append(StringFormatter.format("    if ({0}.size() != compareTo.{0}.size())\n",gen.translate("associationMany",as)));
        checks.append(StringFormatter.format("    {\n"));
        checks.append(StringFormatter.format("      return false;\n"));
        checks.append(StringFormatter.format("    }\n\n"));
        checks.append(StringFormatter.format("    for (int i=0; i<{0}.size(); i++)\n",gen.translate("attributeMany",as)));
        checks.append(StringFormatter.format("    {\n"));
        checks.append(StringFormatter.format("      {0} me = {1}.get(i);\n",gen.translate("type",as),gen.translate("associationMany",as)));
        checks.append(StringFormatter.format("      {0} them = compareTo.{1}.get(i);\n",gen.translate("type",as),gen.translate("associationMany",as)));
        checks.append(StringFormatter.format("      if (me == null && them != null)\n"));
        checks.append(StringFormatter.format("      {\n"));
        checks.append(StringFormatter.format("       return false;\n"));
        checks.append(StringFormatter.format("      }\n"));
        checks.append(StringFormatter.format("      else if (me != null && !me.equals(them))\n"));
        checks.append(StringFormatter.format("      {\n"));
        checks.append(StringFormatter.format("        return false;\n"));
        checks.append(StringFormatter.format("      }\n"));
        checks.append(StringFormatter.format("    }\n"));
      }
      else
      {
        checks.append(StringFormatter.format("    if ({0} == null && compareTo.{0} != null)\n",gen.translate("attributeOne",as)));
        checks.append(StringFormatter.format("    {\n"));
        checks.append(StringFormatter.format("      return false;\n"));
        checks.append(StringFormatter.format("    }\n"));
        checks.append(StringFormatter.format("    else if ({0} != null && !{0}.equals(compareTo.{0}))\n",gen.translate("attributeOne",as)));
        checks.append(StringFormatter.format("    {\n"));
        checks.append(StringFormatter.format("      return false;\n"));
        checks.append(StringFormatter.format("    }\n"));
      }
      checks.append("\n");
    }
    
    if (av != null)
    {
      if ("Integer".equals(av.getType()) && !av.getIsList())
      {
        hash.append(StringFormatter.format("    cachedHashCode = cachedHashCode * 23 + {0};\n",gen.translate("attributeOne",av)));
      }
      else if ("Double".equals(av.getType()) && !av.getIsList())
      {
        hash.append(StringFormatter.format("    cachedHashCode = cachedHashCode * 23 + (new Double({0})).hashCode();\n",gen.translate("attributeOne",av)));
      }
      else if ("Boolean".equals(av.getType()) && !av.getIsList())
      {
        hash.append(StringFormatter.format("    cachedHashCode = cachedHashCode * 23 + ({0} ? 1 : 0);\n",gen.translate("attributeOne",av)));
      }
      else
      {
        String attributeType = av.getIsList() ? "attributeMany" : "attributeOne";
        hash.append(StringFormatter.format("    if ({0} != null)\n",gen.translate(attributeType,av)));
        hash.append(StringFormatter.format("    {\n"));
        hash.append(StringFormatter.format("      cachedHashCode = cachedHashCode * 23 + {0}.hashCode();\n",gen.translate(attributeType,av)));
        hash.append(StringFormatter.format("    }\n"));
        hash.append(StringFormatter.format("    else\n"));
        hash.append(StringFormatter.format("    {\n"));
        hash.append(StringFormatter.format("      cachedHashCode = cachedHashCode * 23;\n"));
        hash.append(StringFormatter.format("    }\n"));
      }
      hash.append("\n");
    }
    else if (as != null)
    {
      String attributeType = as.isOne() ? "attributeOne" : "attributeMany";
      hash.append(StringFormatter.format("    if ({0} != null)\n",gen.translate(attributeType,as)));
      hash.append(StringFormatter.format("    {\n"));
      hash.append(StringFormatter.format("      cachedHashCode = cachedHashCode * 23 + {0}.hashCode();\n",gen.translate(attributeType,as)));
      hash.append(StringFormatter.format("    }\n"));
      hash.append(StringFormatter.format("    else\n"));
      hash.append(StringFormatter.format("    {\n"));
      hash.append(StringFormatter.format("      cachedHashCode = cachedHashCode * 23;\n"));
      hash.append(StringFormatter.format("    }\n"));
    }
  }


    stringBuffer.append(TEXT_1819);
    stringBuffer.append(TEXT_1820);
    stringBuffer.append( uClass.getName() );
    stringBuffer.append(TEXT_1821);
    stringBuffer.append( uClass.getName() );
    stringBuffer.append(TEXT_1822);
    stringBuffer.append(TEXT_1823);
    stringBuffer.append( hash.toString().trim() );
    stringBuffer.append(TEXT_1824);
    stringBuffer.append(TEXT_1825);
    stringBuffer.append( canSet.toString().trim() );
    stringBuffer.append(TEXT_1826);
     } 
    
{ 
  boolean hasActivities = false;
  for(StateMachine sm : uClass.getStateMachines())
  {
    for (State state : sm.getStates())
    {
      if (state.getActivity() != null)
      {
        hasActivities = true;
        
    stringBuffer.append(TEXT_1827);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_1828);
    stringBuffer.append( gen.translate("doActivityMethod",state));
    stringBuffer.append(TEXT_1829);
    stringBuffer.append(TEXT_1830);
    stringBuffer.append( state.getActivity().getActivityCode() );
    stringBuffer.append(TEXT_1831);
    
      }
    }
  } 
  if (hasActivities)
  {
    
       
  StringBuffer output = new StringBuffer();

  isFirst = true;
  for(StateMachine sm : uClass.getStateMachines())
  {
    for (State state : sm.getStates())
    {
      if (state.getActivity() != null)
      {
        if (isFirst)
        {
          output.append(StringFormatter.format("if"));
          isFirst = false;
        }
        else
        {
          output.append(StringFormatter.format("\n        else if"));
        }
        output.append(StringFormatter.format(" (\"{0}\".equals(doActivityMethodName))\n",gen.translate("doActivityMethod",state)));
        output.append(StringFormatter.format("      {\n"));
        output.append(StringFormatter.format("        controller.{0}();\n",gen.translate("doActivityMethod",state)));
        output.append(StringFormatter.format("      }"));
      }
    }
  }

    stringBuffer.append(TEXT_1832);
    stringBuffer.append(TEXT_1833);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_1834);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_1835);
    stringBuffer.append(TEXT_1836);
    stringBuffer.append( output );
    stringBuffer.append(TEXT_1837);
    
  }
}

    
{ 
  boolean hasTimedEvents = false;
  for(StateMachine sm : uClass.getStateMachines())
  {
    for (Event e : sm.getEvents())
    {
      if (e.getIsTimer())
      {
        hasTimedEvents = true;
        
    stringBuffer.append(TEXT_1838);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_1839);
    stringBuffer.append(gen.translate("eventStartMethod",e) );
    stringBuffer.append(TEXT_1840);
    stringBuffer.append(TEXT_1841);
    stringBuffer.append( gen.translate("eventHandler",e) );
    stringBuffer.append(TEXT_1842);
    stringBuffer.append( gen.translate("eventMethod",e) );
    stringBuffer.append(TEXT_1843);
    stringBuffer.append( e.getTimerInSeconds() );
    stringBuffer.append(TEXT_1844);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_1845);
    stringBuffer.append(gen.translate("eventStopMethod",e) );
    stringBuffer.append(TEXT_1846);
    stringBuffer.append(TEXT_1847);
    stringBuffer.append( gen.translate("eventHandler",e) );
    stringBuffer.append(TEXT_1848);
    
      }
    }
  }
  if (hasTimedEvents)
  {
    
    
 


    stringBuffer.append(TEXT_1849);
    stringBuffer.append( gen.translate("type",uClass) );
    stringBuffer.append(TEXT_1850);
    stringBuffer.append( gen.translate("type",uClass) );
    stringBuffer.append(TEXT_1851);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_1852);
    stringBuffer.append(gen.translate("type",uClass));
    stringBuffer.append(TEXT_1853);
    
  for(StateMachine sm : uClass.getStateMachines())
  {
    for (Event e : sm.getEvents())
    {
      if (e.getIsTimer())
      {
        
    stringBuffer.append(TEXT_1854);
    stringBuffer.append( gen.translate("eventMethod",e) );
    stringBuffer.append(TEXT_1855);
    stringBuffer.append( gen.translate("eventMethod",e) );
    stringBuffer.append(TEXT_1856);
    stringBuffer.append( gen.translate("eventStartMethod",e) );
    stringBuffer.append(TEXT_1857);
    
      }
    }
  }

    stringBuffer.append(TEXT_1858);
    
  }
}

    stringBuffer.append(TEXT_1859);
    

  appendln(stringBuffer,"");
  appendln(stringBuffer,"{0}::~{0}()",uClass.getName());
  append(stringBuffer,"  {");

  boolean hasSomethingToDelete = false;

  String customDeletePrefixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("before","delete"));
  String customDeletePostfixCode = GeneratorHelper.toCode(uClass.getApplicableCodeInjections("after","delete"));

  if (customDeletePrefixCode != null) 
  {
    append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customDeletePrefixCode, "    "));
    hasSomethingToDelete = true;
  }

  for (AssociationVariable av : uClass.getAssociationVariables()) 
  {
    AssociationVariable relatedAssociation = av.getRelatedAssociation();
    
    if (!av.getIsNavigable())
    {
      continue;
    }
    
    if (!relatedAssociation.getIsNavigable())
    {
      if (av.isOne())
      {
        hasSomethingToDelete = true;
        
    stringBuffer.append(TEXT_1860);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1861);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1862);
    
      }
      else if (av.isMany())
      {
        hasSomethingToDelete = true;
        
    stringBuffer.append(TEXT_1863);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1864);
    
      }
      continue;
    }
    
    if (av.isOnlyOne() && relatedAssociation.isOnlyOne())
    {
      
    stringBuffer.append(TEXT_1865);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1866);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1867);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1868);
    stringBuffer.append(TEXT_1869);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1870);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1871);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1872);
    
    }
    else if (av.isOptionalOne() && relatedAssociation.isOptionalOne())
    {
      
    stringBuffer.append(TEXT_1873);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1874);
    stringBuffer.append(TEXT_1875);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1876);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_1877);
    
    }
    else if (av.isOnlyOne() && relatedAssociation.isOptionalOne())
    {
      
    stringBuffer.append(TEXT_1878);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1879);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1880);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1881);
    stringBuffer.append(TEXT_1882);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1883);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1884);
    stringBuffer.append(TEXT_1885);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1886);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_1887);
    
    }
    else if (av.isOptionalOne() && relatedAssociation.isOnlyOne())
    {
      
    stringBuffer.append(TEXT_1888);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1889);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1890);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1891);
    stringBuffer.append(TEXT_1892);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1893);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1894);
    stringBuffer.append(gen.translate("parameterExisting",av));
    stringBuffer.append(TEXT_1895);
    
    }
    else if (av.isOptionalOne() && relatedAssociation.isOptionalMany())
    {
      
    stringBuffer.append(TEXT_1896);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1897);
    stringBuffer.append(TEXT_1898);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1899);
    stringBuffer.append(gen.translate("removeParameterOne",av));
    stringBuffer.append(TEXT_1900);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1901);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1902);
    stringBuffer.append(TEXT_1903);
    stringBuffer.append(gen.translate("removeParameterOne",av));
    stringBuffer.append(TEXT_1904);
    stringBuffer.append(gen.relatedTranslate("removeMethod",av));
    stringBuffer.append(TEXT_1905);
    
    }
    else if (av.isOptionalOne() && relatedAssociation.isN())
    {
      
    stringBuffer.append(TEXT_1906);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1907);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1908);
    
    }
    else if (av.isOptionalOne() && relatedAssociation.isMN())
    {
      
    stringBuffer.append(TEXT_1909);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1910);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1911);
    stringBuffer.append(gen.relatedTranslate("numberOfMethod",av));
    stringBuffer.append(TEXT_1912);
    stringBuffer.append(relatedAssociation.getMultiplicity().getLowerBound());
    stringBuffer.append(TEXT_1913);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1914);
    stringBuffer.append(TEXT_1915);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1916);
    stringBuffer.append(gen.translate("removeParameterOne",av));
    stringBuffer.append(TEXT_1917);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1918);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1919);
    stringBuffer.append(TEXT_1920);
    stringBuffer.append(gen.translate("removeParameterOne",av));
    stringBuffer.append(TEXT_1921);
    stringBuffer.append(gen.relatedTranslate("removeMethod",av));
    stringBuffer.append(TEXT_1922);
    
    }
    else if (av.isOne() && relatedAssociation.isMany())
    {
      
    stringBuffer.append(TEXT_1923);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1924);
    stringBuffer.append(gen.translate("removeParameterOne",av));
    stringBuffer.append(TEXT_1925);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1926);
    stringBuffer.append(gen.translate("associationOne",av));
    stringBuffer.append(TEXT_1927);
    stringBuffer.append(TEXT_1928);
    stringBuffer.append(gen.translate("removeParameterOne",av));
    stringBuffer.append(TEXT_1929);
    stringBuffer.append(gen.relatedTranslate("removeMethod",av));
    stringBuffer.append(TEXT_1930);
    
    }
    else if (av.isMandatory() && relatedAssociation.isOptionalOne())
    {
      
    stringBuffer.append(TEXT_1931);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1932);
    stringBuffer.append(TEXT_1933);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_1934);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1935);
    stringBuffer.append(TEXT_1936);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1937);
    
    }
    else if (av.isMany() && (relatedAssociation.isMN() || relatedAssociation.isN()))
    {
      
    stringBuffer.append(TEXT_1938);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1939);
    stringBuffer.append(gen.translate("parameterCopyOfMany",av));
    stringBuffer.append(TEXT_1940);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1941);
    stringBuffer.append(TEXT_1942);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1943);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1944);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1945);
    stringBuffer.append(gen.relatedTranslate("numberOfMethod",av));
    stringBuffer.append(TEXT_1946);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1947);
    stringBuffer.append(gen.relatedTranslate("minimumNumberOfMethod",av));
    stringBuffer.append(TEXT_1948);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1949);
    stringBuffer.append(TEXT_1950);
    stringBuffer.append(gen.translate("parameterOne",av));
    stringBuffer.append(TEXT_1951);
    stringBuffer.append(gen.relatedTranslate("removeMethod",av));
    stringBuffer.append(TEXT_1952);
    
    }
    else if (av.isMany() && relatedAssociation.isMany())
    {
      
    stringBuffer.append(TEXT_1953);
    stringBuffer.append(gen.translate("type",av));
    stringBuffer.append(TEXT_1954);
    stringBuffer.append(gen.translate("parameterCopyOfMany",av));
    stringBuffer.append(TEXT_1955);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1956);
    stringBuffer.append(TEXT_1957);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1958);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1959);
    stringBuffer.append(TEXT_1960);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1961);
    stringBuffer.append(gen.relatedTranslate("removeMethod",av));
    stringBuffer.append(TEXT_1962);
    
    }
    else if (av.isMany() && relatedAssociation.isOnlyOne())
    {
      
    stringBuffer.append(TEXT_1963);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1964);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1965);
    
    }
    else if (av.isMany() && relatedAssociation.isOptionalOne())
    {
      
    stringBuffer.append(TEXT_1966);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1967);
    stringBuffer.append(TEXT_1968);
    stringBuffer.append(gen.translate("associationMany",av));
    stringBuffer.append(TEXT_1969);
    stringBuffer.append(gen.relatedTranslate("setMethod",av));
    stringBuffer.append(TEXT_1970);
    
    }
    else
    {
      continue;
    }
    hasSomethingToDelete = true;
  }
  
  if (!uClass.isRoot() && !"external".equals(uClass.getExtendsClass().getModifier()))
  {
    hasSomethingToDelete = true;
    appendln(stringBuffer,"");
    append(stringBuffer, "    super.delete();");
  }

  if (customDeletePostfixCode != null) 
  {
    append(stringBuffer, "\n{0}",GeneratorHelper.doIndent(customDeletePostfixCode, "    "));
    hasSomethingToDelete = true;
  }

  if (hasSomethingToDelete)
  {
    appendln(stringBuffer, "");
    appendln(stringBuffer, "  }");
  }
  else
  {
    appendln(stringBuffer, "}");
  }


     if (uClass.hasMethods()) { 
    
    if (uClass.hasMethods())
    {
    	for (Method aMethod : uClass.getMethods()) 
    	{
    		String methodModifier = aMethod.getModifier().equals("") ? "" : aMethod.getModifier();
    		String methodName = (uClass.getName()+"::"+aMethod.getName());
    		String methodType = aMethod.getType();
    		String methodBody = aMethod.getIsImplemented() ? "      return " + gen.translate(methodType) + ";" : aMethod.getMethodBody().getExtraCode();
    		String properMethodBody = "      " + methodBody; 
    		String override =  aMethod.getIsImplemented() ? "  @Override" : "";
    		String paramName="";
    		String paramType="";
    		String aSingleParameter="";
    		String isList="";
    	    String parameters = "";
    		if (aMethod.hasMethodParameters())
    		{
    			for (MethodParameter aMethodParam : aMethod.getMethodParameters()) 
    			{
    				paramName = aMethodParam.getName();
    				paramType = aMethodParam.getType();
    				isList = aMethodParam.getIsList() ? " [] " : " ";
    				aSingleParameter = paramType + isList + paramName;
        			parameters += aSingleParameter + ", ";
    			}
    			String finalParams = parameters.substring(0, parameters.length()-2);
    			appendln(stringBuffer, "");
    			
    			if (aMethod.numberOfComments() > 0) { append(stringBuffer, "\n  {0}", Comment.format("Method Javadoc",aMethod.getComments())); }
    			
    			appendln(stringBuffer,override);
    			append(stringBuffer, "  {0} {1} {2}({3})", methodModifier, methodType, methodName, finalParams);	
    			appendln(stringBuffer, "{");
    			appendln(stringBuffer, properMethodBody);
    			appendln(stringBuffer, "  }");
    			
    		}
    		else{
    			appendln(stringBuffer, "");
    			
    			if (aMethod.numberOfComments() > 0) { append(stringBuffer, "\n  {0}", Comment.format("Method Javadoc",aMethod.getComments())); }
    			
    			appendln(stringBuffer,override);
    			append(stringBuffer, "  {0} {1} {2}()", methodModifier, methodType, methodName);
    		    appendln(stringBuffer, "{");
    			appendln(stringBuffer, properMethodBody);
    			appendln(stringBuffer, "  }");
    		}
    	}
    }

     } 
     if (uClass.getExtraCode() != null && uClass.getExtraCode().length() > 0) { 
    stringBuffer.append(TEXT_1971);
    stringBuffer.append(TEXT_1972);
    stringBuffer.append(uClass.getExtraCode());
     } 
    stringBuffer.append(TEXT_1973);
    return stringBuffer.toString();
  }
}