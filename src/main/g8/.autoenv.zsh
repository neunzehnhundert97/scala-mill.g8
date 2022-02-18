$name;format="camel"$()
{
  if [ -f "build.sc" ]; then
    if [[ \$# == "1" ]]; then
      mill -w $name;format="Camel"$.run
    else
      mill $name;format="Camel"$.run
    fi
  else
    echo "No build.sc found";
  fi
}
