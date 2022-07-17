mapping {
 
  map sessionId() onto 'sessionField'
  map firstInSession() onto 'first'
  map partyId() onto 'partyField'
  map timestamp() onto 'timestamp'
  map eventType() onto 'eventTypeField'
  map userAgent().name() onto 'browser_name'

  def locationUri = parse location() to uri
  def localUri = parse locationUri.rawFragment() to uri
  map localUri.path() onto 'localPath'
  map eventParameter('localPath') onto 'localPath'
  map timestamp() onto 'timestamp'
 
   
  map eventParameter('user_country') onto 'user_country'
  map eventParameter('ip') onto 'ip'
  map eventParameter('navigator_app_name') onto 'navigator_app_name'
  map eventParameter('navigator_user_agent') onto 'navigator_user_agent'
  map eventParameter('os_name') onto 'os_name'
  map eventParameter('email_connexion') onto 'email_connexion'   
  map eventParameter('searched_term') onto 'searched_term'
 
}
