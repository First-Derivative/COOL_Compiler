class A { 
  (* string constant too long *)
  e: String <- "\
  ----------------------------------------------------------------------------------\
  ----------------------------------------------------------------------------------\
  ----------------------------------------------------------------------------------\
  ----------------------------------------------------------------------------------\
  ----------------------------------------------------------------------------------\
  ----------------------------------------------------------------------------------\
  ----------------------------------------------------------------------------------\
  ----------------------------------------------------------------------------------\
  ----------------------------------------------------------------------------------\
  ----------------------------------------------------------------------------------\
  ----------------------------------------------------------------------------------\
  ----------------------------------------------------------------------------------\
  ----------------------------------------------------------------------------------\
  ----------------------------------------------------------------------------------\
  ----------------------------------------------------------------------------------\
  ----------------------------------------------------------------------------------\
  ----------------------------------------------------------------------------------\
  ----------------------------------------------------------------------------------\
  ----------------------------------------------------------------------------------\
  ----------------------------------------------------------------------------------\
  ----------------------------------------------------------------------------------\
  ----------------------------------------------------------------------------------\
  ----------------------------------------------------------------------------------\
  ----------------------------------------------------------------------------------\
  "
  (* Escaped null character *)
  d: String <- "\ "
  (* Unescaped null character *)
  c: String <- " "
  (* Unterminated string constant x2 *)
  b: String <- " 
  "
  (* Unescaped null character in unterminated string *)
  a: String <- " 
  (* Escaped null character in unterminated string *)
  f: String <- "\ 
}

-- EOF in comment
(* hello (* world
