require "xmlrpc/client"
begin
	s = XMLRPC::Client.new( "localhost", "/RPC2", 8081)
	r = s.call("ab.sum_and_difference", 5, 3)
	puts "Soma: #{r['sum']} Diferença: #{r['difference']}"
	r = s.call("ba.sum_and_difference", 5, 3)
	puts "Soma: #{r['sum']} Diferença: #{r['difference']}"
rescue XMLRPC::FaultException=> e
		puts "Erro: #{e.faultCode} #{e.faultString}"
end