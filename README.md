Basic webapp to test session attributes, shows session attributes are not getting removed

Example usage:

- Dumps session attributes if exist
localhost:8080/ignite-webapp/

- Sets a session attribute key:value
localhost:8080/ignite-webapp/setAttribute/foo1/bar.htm

- Remove session attribute by key
localhost:8080/ignite-webapp/removeAttribute/foo1.htm

Directory structure:
- ignite node 1 (everything) 
apache-ignite-fabric-2.5.0-bin_node1/

- ignite node 2 (everything)
apache-ignite-fabric-2.5.0-bin_node2/

- exported war
binary/

- webapp
source/


NOTE:

- client config location
source/WebContent/META-INF/config/client-config.xml

- node config locations
apache-ignite-fabric-2.5.0-bin_node1/config/default-config.xml
apache-ignite-fabric-2.5.0-bin_node2/config/default-config.xml
