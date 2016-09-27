# bcs-wrapper

auth0.properties file should go in the main/resources folder:
 
auth0.domain=boundlessgeo-dev.auth0.com
auth0.issuer: https://boundlessgeo-dev.auth0.com/
auth0.clientId=#############################
auth0.clientSecret=#########################
auth0.securedRoute=UNUSED
auth0.base64EncodedSecret: true
auth0.authorityStrategy: ROLES
auth0.defaultAuth0ApiSecurityEnabled: false
auth0.signingAlgorithm: HS256

To get the token from Auth0 post the following to https://boundlessgeo-dev.auth0.com/oauth/ro

{
  "client_id":  "EJ0wxCSQdg2E0jNhukGqYKDSJjSyY4zj", 
  "username":  "#######",
  "password":    "######",
  "connection":   "Username-Password-Authentication",
  "grant_type":  "password",
  "scope":"openid name email roles"
}

To call the secure wrapper services, put the token in the header like this:
authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJuYW1lIjoiZmFzZGZhc2RAYXNkZi5zcyIsImVtYWlsIjoiZmFzZGZhc2RAYXNkZi5zcyIsImVtYWlsX3ZlcmlmaWVkIjp0cnVlLCJyb2xlcyI6WyJST0xFX1VTRVIiLCJST0xFX0FETUlOIl0sImlzcyI6Imh0dHBzOi8vYm91bmRsZXNzZ2VvLWRldi5hdXRoMC5jb20vIiwic3ViIjoiYXV0aDB8NTc2N2VmNmRiYTlmYjY1ODU1MTRkMGQ5IiwiYXVkIjoiRUowd3hDU1FkZzJFMGpOaHVrR3FZS0RTSmpTeVk0emoiLCJleHAiOjE0NzQ5ODIyNDcsImlhdCI6MTQ3NDk0NjI0N30.YPmrlODXPgakZilh49KFsiEG58uAxRCaGh9ohsWj6Kc

To test the security, use the main branch and call:
http://localhost:3001/secured/ping
vs.
http://localhost:3001/pong
