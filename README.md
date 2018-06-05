Basic webapp to test session attributes, shows session attributes are not getting removed

Example usage:

## Dumps session attributes if exist
localhost:8080/ignite-webapp/

# Sets a session attribute key:value
localhost:8080/ignite-webapp/setAttribute/foo1/bar.htm

# Remove session attribute by key
localhost:8080/ignite-webapp/removeAttribute/foo1.htm

Directory structure:
Note: source/WebContent/META-INF/config/client-config.xml  ###Client config location

source/  ## webapp source
binary/ ## exported war
ignite-node-config/ ## ignite node config

