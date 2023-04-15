# ConversionAPI
Simple api converting decimal values to binary and hexagonal values to decimal
Running the code and sending HTTP request to URL localhost:8080\dec-to-bin\{number} will return the number in binary
Running the code and sending HTTP request with JSON body will return JSON with converted number

JSON body raw example(hex):

{

  "hex": "FF"
  
}

will give result:

{

  "dec": "255"
  
}
